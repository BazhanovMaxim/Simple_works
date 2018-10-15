# Description:

<hr>

Given two numbers and an arithmetic operator (the name of it, as a string), return the result of the two numbers having that operator used on them.

`a` and `b` will both be positive integers, and `a` will always be the first number in the operation, and `b` always the second.

The four operators are "add", "subtract", "divide", "multiply".

A few examples:

```
arithmetic(5, 2, "add")      => returns 7
arithmetic(5, 2, "subtract") => returns 3
arithmetic(5, 2, "multiply") => returns 10
arithmetic(5, 2, "divide")   => returns 2.5
```

using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows;
using System.Windows.Controls;
using System.Windows.Data;
using System.Windows.Documents;
using System.Windows.Input;
using System.Windows.Media;
using System.Windows.Media.Imaging;
using System.Windows.Navigation;
using System.Windows.Shapes;

namespace WpfApp2
{
    /// <summary>
    /// Логика взаимодействия для MainWindow.xaml
    /// </summary>
    public partial class MainWindow : Window
    {
        public MainWindow()
        {
            InitializeComponent();

            /// Создаём 3 строки 
            First_grid.RowDefinitions.Add(new RowDefinition { Height = new GridLength(40)});
            First_grid.RowDefinitions.Add(new RowDefinition());
            First_grid.RowDefinitions.Add(new RowDefinition());
            /// Создаём колонки
            First_grid.ColumnDefinitions.Add(new ColumnDefinition());
            First_grid.ColumnDefinitions.Add(new ColumnDefinition());
            First_grid.ColumnDefinitions.Add(new ColumnDefinition());


            // Первая строка (3 кнопки)
            Button button_first = new Button { Content = "Apply", FontSize = 16, Margin = new Thickness(5)};
            Button button_second = new Button { Content = "Reset", FontSize = 16 , Margin = new Thickness(5) };
            Button button_third = new Button { Content = "Refresh", FontSize = 16, Margin = new Thickness(5) };

            First_grid.Children.Add(button_first);
            First_grid.Children.Add(button_second);
            First_grid.Children.Add(button_third);

            Grid.SetColumn(button_first, 0);
            Grid.SetColumn(button_second, 1);
            Grid.SetColumn(button_third, 2);

            Grid.SetRow(button_first, 0);
            Grid.SetRow(button_second, 0);
            Grid.SetRow(button_third, 0);


            // Вторая строка (Pulse properties)

            StackPanel stackPanel = new StackPanel {Margin = new Thickness(10)};
            stackPanel.Orientation = Orientation.Vertical;
            // Текст
            TextBlock textBlock_Pulse = new TextBlock { Text = "Pulse Properties", FontSize=15 };
            TextBlock textBlock_Desciprtion = new TextBlock { Text = "Description" };
            textBlock_Desciprtion.FontWeight = FontWeights.Light;
            textBlock_Pulse.FontWeight = FontWeights.Bold;

            TextBox textBox_decr = new TextBox { };


            // Создание Grid для 
            // Добавление в stackPanel
            stackPanel.Children.Add(textBlock_Pulse);
            stackPanel.Children.Add(textBlock_Desciprtion);
            stackPanel.Children.Add(textBox_decr);

            First_grid.Children.Add(stackPanel);
            Grid.SetColumnSpan(stackPanel, 3);
            Grid.SetRow(stackPanel, 1);
            

        }
    }
}
