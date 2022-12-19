import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class bill {
    private JTextField textFieldON;
    private JTextField textFieldR;
    private JTextField textFieldCuN;
    private JTextField textFieldQ;
    private JTextField textFieldTop;
    private JTextArea textAreaSum;
    private JButton clearButton;
    private JButton generateBillButton;
    private JRadioButton panPizzaRadioButton;
    private JRadioButton stuffedCrustRadioButton;
    private JRadioButton regularRadioButton;
    private JCheckBox onionCheckBox;
    private JCheckBox cheeseCheckBox;
    private JCheckBox babyCornCheckBox;
    private JCheckBox tomatoCheckBox;
    private JPanel PizzaType;
    private JTextField textFieldAm;
    private JPanel mainPanel;

    public int rate;

   public int quant;
    public int topi;
    public int price;

    public bill() {


    generateBillButton.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            quant=Integer.parseInt(textFieldQ.getText());
            price=rate*quant+topi;
            if(!textFieldON.getText().equals("")){
                textFieldAm.setText(String.valueOf(price));
                textAreaSum.setText("Order No. "+textFieldON.getText()+"\n"
                        +"Quantity: "+quant+"\n"
                        +"Name: "+textFieldCuN.getText()+"\n"
                        +"Amount Payable is: "+price);
            }
            else
                textAreaSum.setText("enter order number first");

        }
    });
    clearButton.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            textFieldON.setText("");
            textAreaSum.setText("");
            textFieldR.setText("");
            textFieldAm.setText("");
            textFieldTop.setText("");
            textFieldCuN.setText("");
            textFieldQ.setText("");
            cheeseCheckBox.setSelected(false);
            tomatoCheckBox.setSelected(false);
            onionCheckBox.setSelected(false);
            panPizzaRadioButton.setSelected(false);
            stuffedCrustRadioButton.setSelected(false);
            regularRadioButton.setSelected(false);
        }
    });


        panPizzaRadioButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                rate=150;
                if(!textFieldON.getText().equals(""))
                    textFieldR.setText(String.valueOf(rate));
            }
        });
        stuffedCrustRadioButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                rate=200;
                if(!textFieldON.getText().equals(""))
                    textFieldR.setText(String.valueOf(rate));

            }
        });
        regularRadioButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                rate=100;
                if(!textFieldON.getText().equals(""))
                    textFieldR.setText(String.valueOf(rate));
            }
        });
        onionCheckBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                topi+=10;
                if(!textFieldON.getText().equals(""))
                    textFieldTop.setText(String.valueOf(topi));
            }
        });
        cheeseCheckBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                topi+=10;
                if(!textFieldON.getText().equals(""))
                    textFieldTop.setText(String.valueOf(topi));
            }
        });
        tomatoCheckBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                topi+=10;
                if(!textFieldON.getText().equals(""))
                    textFieldTop.setText(String.valueOf(topi));
            }
        });
    }


    public static void main(String[] args){
        JFrame frame = new JFrame("bill");
        frame.setContentPane(new bill().mainPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}

