class Model{
    Viewer viewer;
        Model (Viewer viewer){
            this.viewer = viewer;
        }

        public void doAction(String value){
            System.out.println("value = " + value);
        }
}

