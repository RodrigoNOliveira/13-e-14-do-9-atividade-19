import javax.swing.JOptionPane;

class App {
    public static void main(String[] args) {

        JOptionPane.showMessageDialog(null, "Digite três números inteiros positivos", "Calculo de médias",
                JOptionPane.INFORMATION_MESSAGE);

        String nmr1S = JOptionPane.showInputDialog(null, "Digite o primeiro número", "Calculo de médias",
                JOptionPane.QUESTION_MESSAGE);
        int nmr1 = Integer.parseInt(nmr1S);

        String nmr2S = JOptionPane.showInputDialog(null, "Digite o segundo número", "Calculo de médias",
                JOptionPane.QUESTION_MESSAGE);
        int nmr2 = Integer.parseInt(nmr2S);

        String nmr3S = JOptionPane.showInputDialog(null, "Digite o terceiro número", "Calculo de médias",
                JOptionPane.QUESTION_MESSAGE);
        int nmr3 = Integer.parseInt(nmr3S);

        if (nmr1 < 0 || nmr2 < 0 || nmr3 < 0) {
            JOptionPane.showMessageDialog(null, "Números digitados inválidos", "Calculo das médias",
                    JOptionPane.ERROR_MESSAGE);
        } else {
            String opcaoS = JOptionPane.showInputDialog(null, "Menu:\n1- Geométrica\n2- Ponderada\n3-Aritmética",
                    "Calculo das Médias", JOptionPane.QUESTION_MESSAGE);

            int opcao = Integer.parseInt(opcaoS);

            if (opcao == 1) {
                double media = Math.cbrt(nmr1 * nmr2 * nmr3);

                JOptionPane.showMessageDialog(null, "A média Geométrica é de: " + media, "Média Geométrica",
                        JOptionPane.INFORMATION_MESSAGE);
            } else if (opcao == 2) {
                double media = (nmr1 + nmr2 * 2 + nmr3 * 3) / 6;

                JOptionPane.showMessageDialog(null, "A média Ponderada é de: " + media, "Média Ponderada",
                        JOptionPane.INFORMATION_MESSAGE);

            } else if (opcao == 3) {
                double media = (nmr1 + nmr2 + nmr3) / 3;

                JOptionPane.showMessageDialog(null, "A média Aritmética é de: " + media, "Média Aritmética",
                        JOptionPane.INFORMATION_MESSAGE);

            }

        }

    }
}