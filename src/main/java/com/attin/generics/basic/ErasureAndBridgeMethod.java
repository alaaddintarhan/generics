package com.attin.generics.basic;

public class ErasureAndBridgeMethod {

    /**
     * Bridge methods are usually occur when inheritance is used
     * 	~ it is an additional method added during type erasure in order to avoid
     * 			ambiguous situations !!!
     */
}

// ------------- BEFORE TYPE ERASURE ----------------
class Node<T> {

    private T data;

    public Node(T data) {
        this.data = data;
    }

    public void setData(T data) {
        this.data = data;
    }
}

class MyNode extends Node<Integer> {

    public MyNode(Integer data) {
        super(data);
    }

    public void setData(Integer data) {
        super.setData(data);
    }
}

// --------------------  AFTER TYPE ERASURE -----------------
class Node2 {

    private Object data;

    public Node2(Object data) {
        this.data = data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}

class MyNode2 extends Node2 {

    public MyNode2(Integer data) {
        super(data);
    }

    public void setData(Integer data) {
        super.setData(data);
    }
}

// -------------------------------------------------------------

// as you can see after type erasure there is a problem:  the setData() method arguments do not match
//		Java compiler is going to create a method in order to solve this problem --> this is the bridge method

class MyNode3 extends Node2 {

    public MyNode3(Integer data) {
        super(data);
    }

    public void setData(Object o) {
        //----- THIS IS THE BRIDGE METHOD !!!--
        setData((Integer) o);
    }

    public void setData(Integer data) {
        super.setData(data);
    }
}