
namespace Estudio
{
    partial class Form8
    {
        /// <summary>
        /// Required designer variable.
        /// </summary>
        private System.ComponentModel.IContainer components = null;

        /// <summary>
        /// Clean up any resources being used.
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
        /// Required method for Designer support - do not modify
        /// the contents of this method with the code editor.
        /// </summary>
        private void InitializeComponent()
        {
            this.gbModalidade = new System.Windows.Forms.GroupBox();
            this.btnAtualizar = new System.Windows.Forms.Button();
            this.lblDesc = new System.Windows.Forms.Label();
            this.lblPreco = new System.Windows.Forms.Label();
            this.lblAlunos = new System.Windows.Forms.Label();
            this.lblAulas = new System.Windows.Forms.Label();
            this.cbDesc = new System.Windows.Forms.ComboBox();
            this.textBox1 = new System.Windows.Forms.TextBox();
            this.textBox2 = new System.Windows.Forms.TextBox();
            this.textBox3 = new System.Windows.Forms.TextBox();
            this.gbModalidade.SuspendLayout();
            this.SuspendLayout();
            // 
            // gbModalidade
            // 
            this.gbModalidade.Controls.Add(this.textBox3);
            this.gbModalidade.Controls.Add(this.textBox2);
            this.gbModalidade.Controls.Add(this.textBox1);
            this.gbModalidade.Controls.Add(this.cbDesc);
            this.gbModalidade.Controls.Add(this.lblAulas);
            this.gbModalidade.Controls.Add(this.lblAlunos);
            this.gbModalidade.Controls.Add(this.lblPreco);
            this.gbModalidade.Controls.Add(this.lblDesc);
            this.gbModalidade.Controls.Add(this.btnAtualizar);
            this.gbModalidade.Location = new System.Drawing.Point(43, 31);
            this.gbModalidade.Name = "gbModalidade";
            this.gbModalidade.Size = new System.Drawing.Size(618, 297);
            this.gbModalidade.TabIndex = 0;
            this.gbModalidade.TabStop = false;
            this.gbModalidade.Text = "Modalidades";
            // 
            // btnAtualizar
            // 
            this.btnAtualizar.Location = new System.Drawing.Point(63, 233);
            this.btnAtualizar.Name = "btnAtualizar";
            this.btnAtualizar.Size = new System.Drawing.Size(510, 27);
            this.btnAtualizar.TabIndex = 0;
            this.btnAtualizar.Text = "Atualizar";
            this.btnAtualizar.UseVisualStyleBackColor = true;
            // 
            // lblDesc
            // 
            this.lblDesc.AutoSize = true;
            this.lblDesc.Location = new System.Drawing.Point(60, 55);
            this.lblDesc.Name = "lblDesc";
            this.lblDesc.Size = new System.Drawing.Size(58, 13);
            this.lblDesc.TabIndex = 1;
            this.lblDesc.Text = "Descrição:";
            // 
            // lblPreco
            // 
            this.lblPreco.AutoSize = true;
            this.lblPreco.Location = new System.Drawing.Point(60, 106);
            this.lblPreco.Name = "lblPreco";
            this.lblPreco.Size = new System.Drawing.Size(38, 13);
            this.lblPreco.TabIndex = 2;
            this.lblPreco.Text = "Preço:";
            // 
            // lblAlunos
            // 
            this.lblAlunos.AutoSize = true;
            this.lblAlunos.Location = new System.Drawing.Point(60, 151);
            this.lblAlunos.Name = "lblAlunos";
            this.lblAlunos.Size = new System.Drawing.Size(83, 13);
            this.lblAlunos.TabIndex = 3;
            this.lblAlunos.Text = "Qtde de Alunos:";
            // 
            // lblAulas
            // 
            this.lblAulas.AutoSize = true;
            this.lblAulas.Location = new System.Drawing.Point(60, 195);
            this.lblAulas.Name = "lblAulas";
            this.lblAulas.Size = new System.Drawing.Size(77, 13);
            this.lblAulas.TabIndex = 4;
            this.lblAulas.Text = "Qtde de Aulas:";
            // 
            // cbDesc
            // 
            this.cbDesc.FormattingEnabled = true;
            this.cbDesc.Items.AddRange(new object[] {
            "Balé - 2x",
            "Balé - 3x",
            "Pilates - 2x"});
            this.cbDesc.Location = new System.Drawing.Point(151, 52);
            this.cbDesc.Name = "cbDesc";
            this.cbDesc.Size = new System.Drawing.Size(422, 21);
            this.cbDesc.TabIndex = 5;
            // 
            // textBox1
            // 
            this.textBox1.Location = new System.Drawing.Point(151, 103);
            this.textBox1.Name = "textBox1";
            this.textBox1.Size = new System.Drawing.Size(422, 20);
            this.textBox1.TabIndex = 6;
            this.textBox1.TextChanged += new System.EventHandler(this.textBox1_TextChanged);
            // 
            // textBox2
            // 
            this.textBox2.Location = new System.Drawing.Point(164, 148);
            this.textBox2.Name = "textBox2";
            this.textBox2.Size = new System.Drawing.Size(409, 20);
            this.textBox2.TabIndex = 7;
            // 
            // textBox3
            // 
            this.textBox3.Location = new System.Drawing.Point(164, 192);
            this.textBox3.Name = "textBox3";
            this.textBox3.Size = new System.Drawing.Size(409, 20);
            this.textBox3.TabIndex = 8;
            // 
            // Form8
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(6F, 13F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.ClientSize = new System.Drawing.Size(704, 361);
            this.Controls.Add(this.gbModalidade);
            this.Name = "Form8";
            this.Text = "Consultar Modalidade";
            this.gbModalidade.ResumeLayout(false);
            this.gbModalidade.PerformLayout();
            this.ResumeLayout(false);

        }

        #endregion

        private System.Windows.Forms.GroupBox gbModalidade;
        private System.Windows.Forms.TextBox textBox3;
        private System.Windows.Forms.TextBox textBox2;
        private System.Windows.Forms.TextBox textBox1;
        private System.Windows.Forms.ComboBox cbDesc;
        private System.Windows.Forms.Label lblAulas;
        private System.Windows.Forms.Label lblAlunos;
        private System.Windows.Forms.Label lblPreco;
        private System.Windows.Forms.Label lblDesc;
        private System.Windows.Forms.Button btnAtualizar;
    }
}