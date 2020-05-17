set term post eps color solid enh 'ArialMT' 26
set output 'delay.eps'
set xrange [0:6]
set xtics ('10' 1, '20' 2, '30' 3, '40' 4, '50' 5)
set xlabel 'Number of Concurrent Senders'
set ylabel 'Completion Time (ms)'
set yrange [1000:2000]
set ytics 1000,200,2000
set key top right
set key samplen 2 spacing 2 font ',22' box lw 2
plot 'data.txt' using 1:3 with linespoints t 'Lab Testbed' lt 7 lw 4 ps 2 pt 4
