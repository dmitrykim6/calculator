class Model{
    Viewer viewer;
    String temp;
    String leftValue;
    String rightValue;
    char action;

    Model (Viewer viewer){
        this.viewer = viewer;
        temp = "";
        leftValue = "";
        rightValue = "";
        action = '@';
    }

    public void doAction(String value){

        if (value.equals("One")){
            temp = temp + "1";

        } else if(value.equals("Two")) {
            temp = temp + "2";

        } else if(value.equals("Plus")){
            leftValue = temp;
            temp = "";
            action = '+';
            return;

        } else if(value.equals("Minus")) {
            leftValue = temp;
            temp = "";
            action = '-';
            return;

        } else if(value.equals("Equals")){
            rightValue = temp;
            int numberLeft = Integer.parseInt(leftValue);
            int numberRight = Integer.parseInt(rightValue);
            int answer = 0;

            switch(action){
                case '+':
                    answer = numberLeft + numberRight;
                    break;
                case '-' :
                    answer = numberLeft - numberRight;
                    break;
            }

            temp = String.valueOf(answer);

            char a = temp.charAt(temp.length() - 2);
            char b = temp.charAt(temp.length() - 1);

            if(a == '.' && b == '0'){
                temp = temp.substring(0, temp.length()-2);
            }


        }

        viewer.update(temp);
    }
}

