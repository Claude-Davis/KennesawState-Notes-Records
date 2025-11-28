namespace Lab12
{
    partial class Form1
    {
        /// <summary>
        ///  Required designer variable.
        /// </summary>
        private System.ComponentModel.IContainer components = null;

        /// <summary>
        ///  Clean up any resources being used.
        /// </summary>
        /// <param name="disposing">true if managed resources should be disposed; otherwise, false.</param>
        protected override void Dispose(bool disposing)
        {
            if (disposing && (components != null))
            {
                components.Dispose();
            }
            base.Dispose(disposing);
        }

        #region Windows Form Designer generated code

        /// <summary>
        ///  Required method for Designer support - do not modify
        ///  the contents of this method with the code editor.
        /// </summary>
        private void InitializeComponent()
        {
            fileSystemWatcher1 = new FileSystemWatcher();
            operand1txtbox = new TextBox();
            operand2txtbox = new TextBox();
            sumbtn = new Button();
            clearbtn = new Button();
            label1 = new Label();
            resultlbl = new Label();
            ((System.ComponentModel.ISupportInitialize)fileSystemWatcher1).BeginInit();
            SuspendLayout();
            // 
            // fileSystemWatcher1
            // 
            fileSystemWatcher1.EnableRaisingEvents = true;
            fileSystemWatcher1.SynchronizingObject = this;
            // 
            // operand1txtbox
            // 
            operand1txtbox.Location = new Point(12, 12);
            operand1txtbox.Name = "operand1txtbox";
            operand1txtbox.Size = new Size(100, 27);
            operand1txtbox.TabIndex = 1;
            // 
            // operand2txtbox
            // 
            operand2txtbox.Location = new Point(118, 12);
            operand2txtbox.Name = "operand2txtbox";
            operand2txtbox.Size = new Size(100, 27);
            operand2txtbox.TabIndex = 2;
            operand2txtbox.TextChanged += textBox1_TextChanged;
            // 
            // sumbtn
            // 
            sumbtn.Location = new Point(12, 41);
            sumbtn.Name = "sumbtn";
            sumbtn.Size = new Size(74, 23);
            sumbtn.TabIndex = 3;
            sumbtn.Text = "Sum";
            sumbtn.UseVisualStyleBackColor = true;
            sumbtn.Click += sumbtn_Click;
            // 
            // clearbtn
            // 
            clearbtn.Location = new Point(92, 41);
            clearbtn.Name = "clearbtn";
            clearbtn.Size = new Size(74, 23);
            clearbtn.TabIndex = 4;
            clearbtn.Text = "Clear";
            clearbtn.UseVisualStyleBackColor = true;
            clearbtn.Click += clearbtn_Click;
            // 
            // label1
            // 
            label1.AutoSize = true;
            label1.Location = new Point(20, 20);
            label1.Name = "label1";
            label1.Size = new Size(0, 20);
            label1.TabIndex = 5;
            // 
            // resultlbl
            // 
            resultlbl.AutoSize = true;
            resultlbl.Location = new Point(224, 15);
            resultlbl.Name = "resultlbl";
            resultlbl.Size = new Size(13, 20);
            resultlbl.TabIndex = 6;
            resultlbl.Text = " ";
            resultlbl.Click += resultlbl_Click;
            // 
            // Form1
            // 
            AutoScaleDimensions = new SizeF(8F, 20F);
            AutoScaleMode = AutoScaleMode.Font;
            ClientSize = new Size(342, 63);
            Controls.Add(resultlbl);
            Controls.Add(label1);
            Controls.Add(clearbtn);
            Controls.Add(sumbtn);
            Controls.Add(operand2txtbox);
            Controls.Add(operand1txtbox);
            Name = "Form1";
            Text = "FYE Summator";
            ((System.ComponentModel.ISupportInitialize)fileSystemWatcher1).EndInit();
            ResumeLayout(false);
            PerformLayout();
        }

        #endregion

        private FileSystemWatcher fileSystemWatcher1;
        private TextBox operand2txtbox;
        private TextBox operand1txtbox;
        private Button clearbtn;
        private Button sumbtn;
        private Label resultlbl;
        private Label label1;
    }
}
