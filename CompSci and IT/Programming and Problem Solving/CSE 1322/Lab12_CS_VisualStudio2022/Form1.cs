namespace Lab12
{
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();
        }

        private void textBox1_TextChanged(object sender, EventArgs e)
        {

        }

        private void resultlbl_Click(object sender, EventArgs e)
        {

        }

        private void sumbtn_Click(object sender, EventArgs e)
        {
            try
            {
                int firstNum = Int32.Parse(operand1txtbox.Text);  //converts the value of operand1txtbox from String to int type
                int secNum = Int32.Parse(operand2txtbox.Text);   //converts the value of operand1txtbox from String to int type
                int sum = firstNum + secNum;

                resultlbl.Text = sum.ToString();
            }
            catch (FormatException)
            {
                resultlbl.Text = "That is not a number!";
            }
        }

        private void clearbtn_Click(object sender, EventArgs e)
        {
            operand1txtbox.Text = " ";
            operand2txtbox.Text = " ";
            resultlbl.Text = " ";
        }
    }
}
