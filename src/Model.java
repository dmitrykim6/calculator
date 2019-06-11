class Model {
    private Viewer viewer;
    private String temp; //
    private String leftValue; // first number
    private String rightValue; // second number
    private String tempLeftValue;
    private char action; //
    private boolean newAction;
    private boolean firstOperation;

    private boolean firstAction;
    private boolean haveDot;


//    int equalsCount; // счетчик повторных нажатий на РАВНО

    Model (Viewer viewer){
        this.viewer = viewer;
        temp = "";
        tempLeftValue = "0";
        leftValue = "0";
        rightValue = "0";
        action = '@';
        newAction = true;
        firstOperation = true;
        haveDot = false;
        firstAction = true;
    }

    public void doAction(String value) {

        if (value.equals("C")) {
            haveDot = false;
            temp = "0";
            leftValue = "0";
            rightValue = "0";
            action = '@';
            newAction = true;
            firstOperation = true;
            firstAction = true;

        }else if (value.equals("One")) {
            if(newAction){
                temp = "1";
                newAction = false;
            }else {
                temp = temp + "1";
            }

        } else if (value.equals("Two")) {
            if(newAction){
                temp = "2";
                newAction = false;
            }else {
                temp = temp + "2";
            }

        } else if (value.equals("Three")) {
            if(newAction){
                temp = "3";
                newAction = false;
            }else {
                temp = temp + "3";
            }

        } else if (value.equals("Four")) {
            if(newAction){
                temp = "4";
                newAction = false;
            }else {
                temp = temp + "4";
            }

        } else if (value.equals("Five")) {
            if(newAction){
                temp = "5";
                newAction = false;
            }else {
                temp = temp + "5";
            }

        } else if (value.equals("Six")) {
            if(newAction){
                temp = "6";
                newAction = false;
            }else {
                temp = temp + "6";
            }

        } else if (value.equals("Seven")) {
            if(newAction){
                temp = "7";
                newAction = false;
            }else {
                temp = temp + "7";
            }

        } else if (value.equals("Eight")) {
            if(newAction){
                temp = "8";
                newAction = false;
            }else {
                temp = temp + "8";
            }

        } else if (value.equals("Nine")) {
            if(newAction){
                temp = "9";
                newAction = false;
            }else {
                temp = temp + "9";
            }

        } else if (value.equals("Zero")) {
            if(newAction){
                temp = "0";
                newAction = false;
            }else {
                temp = temp + "0";
            }

        } else if (value.equals("dot")) {
            if(temp.equals("")){
                temp = "0";
                viewer.update("0");
            }
            if(!haveDot) {
                haveDot = true;
                if (newAction) {
                    if(temp.equals("0")){
                        temp = "0.";
                    }else{
                        temp = ".";
                    }
                    newAction = false;
                } else {
                    temp = temp + ".";
                }
            }else return;

        }else if(value.equals("Plus")){
            action = '+';
            if(firstAction) {
                firstAction = false;
                newAction = true;
                leftValue = temp;
                temp = "";
                haveDot = false;
                return;
            }else{
                Equal(leftValue, temp, action);
            }

        }else if(value.equals("Minus")){
            action = '-';
            if(firstAction) {
                firstAction = false;
                newAction = true;
                leftValue = temp;
                temp = "";
                haveDot = false;
                return;
            }else{
                Equal(leftValue, temp, action);
            }

        } else if(value.equals("Multiply")){
            action = '*';
            if(firstAction) {
                firstAction = false;
                newAction = true;
                leftValue = temp;
                temp = "";
                haveDot = false;
                return;
            }else{
                Equal(leftValue, temp, action);
            }

        } else if(value.equals("Divide")){
            action = '/';
            if(firstAction) {
                firstAction = false;
                newAction = true;
                leftValue = temp;
                temp = "";
                haveDot = false;
                return;
            }else{
                Equal(leftValue, temp, action);
            }

        }
        else if(value.equals("1/x")){

            double numberRight = Double.parseDouble(temp);
            double answer = Math.round((1 / 6)*10000)/10000;

            temp = String.valueOf(answer);

            viewer.update(temp);


        }

        else if(value.equals("Equal")){

                if(firstOperation){
                    rightValue = temp;
                    Equal(leftValue, rightValue, action);
                    firstOperation = false;
                    newAction = true;
                    firstAction = true;
                    leftValue = temp;

                }else{

                    Equal(leftValue, temp, action);
                    leftValue = temp;
                    firstOperation = false;
                    newAction = true;
                    firstAction = true;
                }
        }

        viewer.update(temp);
    }



    private void Equal(String leftValue, String rightValue, char action){


        double numberLeft = Double.parseDouble(leftValue);
        double numberRight = Double.parseDouble(rightValue);
        double answer = 0;

        switch(action){
            case '@':
                answer = 0;
                break;
            case '+':
                answer = numberLeft + numberRight;
                break;
            case '-' :
                answer = numberLeft - numberRight;
                break;
            case '*' :
                answer = numberLeft * numberRight;
                break;
            case '/' :
                answer = numberLeft / numberRight;
                break;
        }

        temp = String.valueOf(answer);

    }
}


