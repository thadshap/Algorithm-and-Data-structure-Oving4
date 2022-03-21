public class TreNode {
    Object element;
    TreNode venstre, høyre, forelder;

    public TreNode(Object e, TreNode v, TreNode h){
        element = e;
        venstre = v;
        høyre = h;
    }

}


