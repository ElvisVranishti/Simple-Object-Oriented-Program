//Elvis Vranishti
public class LinkedList {
    private Node m_first;
    private int m_numItems;

    public LinkedList() {
        m_first = null;
        m_numItems = 0;
    }

    public int getNumItems() {
        return m_numItems;
    }
    public boolean isEmpty() {
        if(m_first == null || m_numItems == 0) {
            return true;
        }
        else {
            return false;
        }
    }

    public void  insert(int index, String Model) {
        Node newNode = new Node(Model);
        Node current = m_first;
        Node prev = null;

        //first case - empty list
        if (m_first == null) {
            m_first = newNode;
            m_numItems++;
        }
        //case 2 - list has 1 element
        else if (m_numItems == 1) {
            if (index == 1) {
                m_first = newNode;
                newNode.setLink(current);
                m_numItems++;
            }
            else {
                current.setLink(newNode);
                m_numItems++;
            }
        }
        //case 3 - if list contains more than 1 element
        else {
            int count = 1;
            //traversing
            while (count <= index) {
                if (count != index) {
                    count++;
                    prev = current;
                    current = current.getLink();
                }
                //if count == index
                else {
                    prev.setLink(newNode);
                    newNode.setLink(current);
                    count++;
                    m_numItems++;
                }
            }
        }
    }
    public void  remove(int index, String Model) throws Exception {
        Node head = new Node(Model);
        Node current = m_first;
        Node prev = null;
        if(current == null) {
            throw new Exception("The list is empty");
        }
        else {
                current = null;
        }


    }

    public String avg() {
        Node current = m_first;
        String sum = "";

        while (current != null) {
            sum += current.getInfo();
            current = current.getLink();
        }
        return sum;
    }
    @Override
    public String toString() {
        String content = "The content of the list is: \n";
        Node current = m_first;

        while (current != null) {
            content += current.getInfo() + ", ";
            current = current.getLink();
        }
        return content;
    }
}

