public class Node {
    private int data;
    private Node next;

    public Node() {
        this.next = null;
    }
    public Node(int data) {
        this.data = data;
    }

    public void setNext(Node next) {
        this.next = next;
    }
    public Node getNext() {
        return next;
    }
    public void setData(int data) {
        this.data = data;
    }
    public int getData() {
        return data;
    }


    public boolean isListEmpty() {
        return this.next == null;
    }

    public void addElement(int data) {
        Node node = new Node(data);

        if(isListEmpty()) {
            next = node;
        } else {
            Node aux = next;
            while(aux.getNext() != null)
                aux = aux.getNext();
            aux.setNext(node);
        }
    }

    public void deleteElement() {
        if(!isListEmpty()) {
            if(next.getNext() == null){
                System.out.println(this.data + " was deleted");
                next = null;
            } else {
                Node aux = next;
                while(aux.getNext().getNext() != null)
                    aux = aux.getNext();
                System.out.println(aux.getNext().getData() + " was deleted");
                aux.setNext(null);
            }
        } else {
            System.out.println("\n\tError: Trying to delete from an empty list.");
        }
    }

    public void showList() {
        if(!isListEmpty()) {
            Node aux = next;
            while(aux != null) {
                System.out.print(aux.getData()+ "\t");
                aux = aux.getNext();
            } 
        } else {
            System.out.println("\n\tThe list is empty.");
        }
    }
}
