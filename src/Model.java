class Model {
    Viewer viewer;
    String temp; //
    String leftValue; // first number
    String rightValue; // second number
    char action; //

    Model (Viewer viewer){
        this.viewer = viewer;
        temp = "";
        leftValue = "";
        rightValue = "";
        action = '@';
    }

    public void doAction(String value) {

        if (value.equals("C")) {
            temp = "";
            leftValue = "";
            rightValue = "";
            action = '@';

        }else if (value.equals("One")) {
            temp = temp + "1";

        } else if (value.equals("Two")) {
            temp = temp + "2";

        }else if (value.equals("Three")) {
            temp = temp + "3";

        }else if (value.equals("Four")) {
            temp = temp + "4";

        }else if (value.equals("Five")) {
            temp = temp + "5";

        }else if (value.equals("Six")) {
            temp = temp + "6";

        }else if (value.equals("Seven")) {
            temp = temp + "7";

        }else if (value.equals("Eight")) {
            temp = temp + "8";

        }else if (value.equals("Nine")) {
            temp = temp + "9";

        }else if (value.equals("Zero")) {
            temp = temp + "0";

        }else if(value.equals("Plus")){
            leftValue = temp;
            temp = "";
            action = '+';
            return;

        }else if(value.equals("Minus")){
            leftValue = temp;
            temp = "";
            action = '-';
            return;

        }

        else if(value.equals("Equal")){

            Equal(leftValue, action);
        }

        viewer.update(temp);
    }

    public void Equal(String leftValue, char action){

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


        // ошибка при сложении маленьких чисел!
//        char a = temp.charAt(temp.length() - 2);
//        char b = temp.charAt(temp.length() - 1);
//
//        if(a == '.' && b == '0'){
//            temp = temp.substring(0, temp.length()-2);
//        }
    }
}
