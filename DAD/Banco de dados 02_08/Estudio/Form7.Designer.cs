
namespace Estudio
{
    partial class Form7
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
            this.gbModalidades = new System.Windows.Forms.GroupBox();
            this.lblDesc = new System.Windows.Forms.Label();
            this.cbDesc = new System.Windows.Forms.ComboBox();
            this.btnExcluir = new System.Windows.Forms.Button();
            this.gbModalidades.SuspendLayout();
            this.SuspendLayout();
            // 
            // gbModalidades
            // 
            this.gbModalidades.Controls.Add(this.btnExcluir);
            this.gbModalidades.Controls.Add(this.cbDesc);
            this.gbModalidades.Controls.Add(this.lblDesc);
            this.gbModalidades.Location = new System.Drawing.Point(37, 43);
            this.gbModalidades.Name = "gbModalidades";
            this.gbModalidades.Size = new System.Drawing.Size(385, 142);
            this.gbModalidades.TabIndex = 0;
            this.gbModalidades.TabStop = false;
            this.gbModalidades.Text = "Modalidades";
            // 
            // lblDesc
            // 
            this.lblDesc.AutoSize = true;
            this.lblDesc.Location = new System.Drawing.Point(22, 64);
            this.lblDesc.Name = "lblDesc";
            this.lblDesc.Size = new System.Drawing.Size(58, 13);
            this.lblDesc.TabIndex = 0;
            this.lblDesc.Text = "Descrição:";
            // 
            // cbDesc
            // 
            this.cbDesc.FormattingEnabled = true;
            this.cbDesc.Location = new System.Drawing.Point(99, 61);
            this.cbDesc.Name = "cbDesc";
            this.cbDesc.Size = new System.Drawing.Size(265, 21);
            this.cbDesc.TabIndex = 1;
            // 
            // btnExcluir
            // 
            this.btnExcluir.Location = new System.Drawing.Point(25, 111);
            this.btnExcluir.Name = "btnExcluir";
            this.btnExcluir.Size = new System.Drawing.Size(339, 23);
            this.btnExcluir.TabIndex = 2;
            this.btnExcluir.Text = "Excluir";
            this.btnExcluir.UseVisualStyleBackColor = true;
            // 
            // Form7
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(6F, 13F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.ClientSize = new System.Drawing.Size(457, 214);
            this.Controls.Add(this.gbModalidades);
            this.Name = "Form7";
            this.Text = "Excluir Modalidade";
            this.gbModalidades.ResumeLayout(false);
            this.gbModalidades.PerformLayout();
            this.ResumeLayout(false);

        }

        #endregion

        private System.Windows.Forms.GroupBox gbModalidades;
        private System.Windows.Forms.Button btnExcluir;
        private System.Windows.Forms.ComboBox cbDesc;
        private System.Windows.Forms.Label lblDesc;
    }
}