//Elvis Vranishti
public class Node {
        // instance variables
        private String m_info;
        private Node m_link;
        // constructor
        public Node(String info)
        {
            m_info = info;
            m_link = null;

        }

        // member methods

        public void setLink(Node link)
        {
            m_link = link;
        }

        public Node getLink()
        {
            return m_link;
        }

        public String getInfo()
        {
            return m_info;
        }
}
