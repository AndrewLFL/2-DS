
namespace Estudio
{
    partial class Form6
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
            this.lblDesc = new System.Windows.Forms.Label();
            this.lblPreco = new System.Windows.Forms.Label();
            this.lblAlunos = new System.Windows.Forms.Label();
            this.lblAulas = new System.Windows.Forms.Label();
            this.btnCadastrar = new System.Windows.Forms.Button();
            this.txtDesc = new System.Windows.Forms.TextBox();
            this.txtPreco = new System.Windows.Forms.TextBox();
            this.txtAlunos = new System.Windows.Forms.TextBox();
            this.txtAulas = new System.Windows.Forms.TextBox();
            this.gbModalidade.SuspendLayout();
            this.SuspendLayout();
            // 
            // gbModalidade
            // 
            this.gbModalidade.Controls.Add(this.txtAulas);
            this.gbModalidade.Controls.Add(this.txtAlunos);
            this.gbModalidade.Controls.Add(this.txtPreco);
            this.gbModalidade.Controls.Add(this.txtDesc);
            this.gbModalidade.Controls.Add(this.btnCadastrar);
            this.gbModalidade.Controls.Add(this.lblAulas);
            this.gbModalidade.Controls.Add(this.lblAlunos);
            this.gbModalidade.Controls.Add(this.lblPreco);
            this.gbModalidade.Controls.Add(this.lblDesc);
            this.gbModalidade.Location = new System.Drawing.Point(36, 35);
            this.gbModalidade.Name = "gbModalidade";
            this.gbModalidade.Size = new System.Drawing.Size(364, 355);
            this.gbModalidade.TabIndex = 0;
            this.gbModalidade.TabStop = false;
            this.gbModalidade.Text = "Modalidades";
            // 
            // lblDesc
            // 
            this.lblDesc.AutoSize = true;
            this.lblDesc.Location = new System.Drawing.Point(50, 59);
            this.lblDesc.Name = "lblDesc";
            this.lblDesc.Size = new System.Drawing.Size(58, 13);
            this.lblDesc.TabIndex = 0;
            this.lblDesc.Text = "Descrição:";
            // 
            // lblPreco
            // 
            this.lblPreco.AutoSize = true;
            this.lblPreco.Location = new System.Drawing.Point(50, 111);
            this.lblPreco.Name = "lblPreco";
            this.lblPreco.Size = new System.Drawing.Size(38, 13);
            this.lblPreco.TabIndex = 1;
            this.lblPreco.Text = "Preço:";
            // 
            // lblAlunos
            // 
            this.lblAlunos.AutoSize = true;
            this.lblAlunos.Location = new System.Drawing.Point(50, 163);
            this.lblAlunos.Name = "lblAlunos";
            this.lblAlunos.Size = new System.Drawing.Size(83, 13);
            this.lblAlunos.TabIndex = 2;
            this.lblAlunos.Text = "Qtde de Alunos:";
            // 
            // lblAulas
            // 
            this.lblAulas.AutoSize = true;
            this.lblAulas.Location = new System.Drawing.Point(50, 223);
            this.lblAulas.Name = "lblAulas";
            this.lblAulas.Size = new System.Drawing.Size(77, 13);
            this.lblAulas.TabIndex = 3;
            this.lblAulas.Text = "Qtde de Aulas:";
            // 
            // btnCadastrar
            // 
            this.btnCadastrar.Location = new System.Drawing.Point(53, 278);
            this.btnCadastrar.Name = "btnCadastrar";
            this.btnCadastrar.Size = new System.Drawing.Size(249, 23);
            this.btnCadastrar.TabIndex = 4;
            this.btnCadastrar.Text = "Cadastrar";
            this.btnCadastrar.UseVisualStyleBackColor = true;
            this.btnCadastrar.Click += new System.EventHandler(this.btnCadastrar_Click);
            // 
            // txtDesc
            // 
            this.txtDesc.Location = new System.Drawing.Point(202, 56);
            this.txtDesc.Name = "txtDesc";
            this.txtDesc.Size = new System.Drawing.Size(100, 20);
            this.txtDesc.TabIndex = 5;
            // 
            // txtPreco
            // 
            this.txtPreco.Location = new System.Drawing.Point(202, 111);
            this.txtPreco.Name = "txtPreco";
            this.txtPreco.Size = new System.Drawing.Size(100, 20);
            this.txtPreco.TabIndex = 6;
            // 
            // txtAlunos
            // 
            this.txtAlunos.Location = new System.Drawing.Point(202, 160);
            this.txtAlunos.Name = "txtAlunos";
            this.txtAlunos.Size = new System.Drawing.Size(100, 20);
            this.txtAlunos.TabIndex = 7;
            // 
            // txtAulas
            // 
            this.txtAulas.Location = new System.Drawing.Point(202, 223);
            this.txtAulas.Name = "txtAulas";
            this.txtAulas.Size = new System.Drawing.Size(100, 20);
            this.txtAulas.TabIndex = 8;
            // 
            // Form6
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(6F, 13F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.ClientSize = new System.Drawing.Size(440, 432);
            this.Controls.Add(this.gbModalidade);
            this.Name = "Form6";
            this.Text = "Cadastro de Modalidades";
            this.gbModalidade.ResumeLayout(false);
            this.gbModalidade.PerformLayout();
            this.ResumeLayout(false);

        }

        #endregion

        private System.Windows.Forms.GroupBox gbModalidade;
        private System.Windows.Forms.TextBox txtAulas;
        private System.Windows.Forms.TextBox txtAlunos;
        private System.Windows.Forms.TextBox txtPreco;
        private System.Windows.Forms.TextBox txtDesc;
        private System.Windows.Forms.Button btnCadastrar;
        private System.Windows.Forms.Label lblAulas;
        private System.Windows.Forms.Label lblAlunos;
        private System.Windows.Forms.Label lblPreco;
        private System.Windows.Forms.Label lblDesc;
    }
}