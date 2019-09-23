package test.vip;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Jiang.YX
 * @version 1.0
 * @date 2019/9/15 18:58
 */
public class LFUCache {
    private Map<Integer,Node> cache;
    //最大容量
    private int capacity=0;
    //已经使用的容量
    private int used=0;

    public LFUCache(int capacity){
        cache=new HashMap<>(capacity*2);
        this.capacity=capacity;
    }

    public int get(int key){
        Node node=cache.get(key);
        if(node!=null){
            //自增使用次数，更新最后使用时间
            node.usedTimes=node.usedTimes+1;
            node.lastUsedTime=System.nanoTime();
            return node.value;
        }else{
            return -1;
        }
    }

    public void set(int key,int value){
        Node node=cache.get(key);
        if(node!=null){
            //如果这个key在缓存中已经存在，则自增使用次数，更新最后使用时间
            node.value=value;
            node.usedTimes++;
            node.lastUsedTime=System.nanoTime();
        }else{
            //如果这个key在缓存中不存在，则
            node=new Node();
            node.value=value;
            node.usedTimes=0;
            node.lastUsedTime=System.nanoTime();
            if(used<capacity){
                //缓存未满，直接添加
                cache.put(key,node);
                used++;
            }else{
                //缓存已满，删除一个元素后添加
                remove();
                cache.put(key,node);
            }
        }
    }

    public void remove(){
        int minCount=Integer.MIN_VALUE;
        long time=System.nanoTime();
        Integer k=null;
        for (Map.Entry<Integer, Node> entry : cache.entrySet()) {
            if(entry.getValue().usedTimes<minCount||(entry.getValue().usedTimes==minCount&&entry.getValue().lastUsedTime<time)){
                //如果使用次数更少或者使用次数相同但最近使用时间更前
                k=entry.getKey();
                minCount=entry.getValue().usedTimes;
                time=entry.getValue().lastUsedTime;
            }
        }
        cache.remove(k);
    }

    public class Node{
        public int value;
        public int usedTimes;
        public long lastUsedTime;
    }
}
