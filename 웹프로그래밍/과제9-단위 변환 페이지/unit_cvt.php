<html>
    <head>
        <meta charset="UTF-8">
        <style>
            #info{
                display: inline-block;
                transform: translate(120px, -62px);
            }
            table{
                width: 400px;
                border-collapse: collapse;
                border: 3px solid;
                border-color: red;
                text-align: center;
                transform: translateY(-70px);
            }
        </style>
    </head>
    <body>
        <?php
            $number = $_POST["num"];
            $unit = $_POST["unit"];

            if($unit == '미터(m)'){
                $m_num = round($number, 4);
                $in_num = round($number * 39.370079, 4);
                $ft_num = round($number * 3.28084, 4);
                $yd_num = round($number * 1.093613, 4);
            }

            if($unit == '인치(in)'){
                $m_num = round($number * 0.0254, 4);
                $in_num = round($number, 4);
                $ft_num = round($number * 0.083333, 4);
                $yd_num = round($number * 0.027778, 4);
            }

            if($unit == '피트(ft)'){
                $m_num = round($number * 0.3048, 4);
                $in_num = round($number * 12, 4);
                $ft_num = round($number, 4);
                $yd_num = round($number * 0.333333, 4);
            }

            if($unit == '야드(yd)'){
                $m_num = round($number * 0.9144, 4);
                $in_num = round($number * 36, 4);
                $ft_num = round($number * 3, 4);
                $yd_num = round($number, 4);
            }
        ?>
        <h3>단위 변환기 :</h3>
        <h3 id="info"><?= $number?>&nbsp;<?= $unit?></h3>
        <p>
        <table border=1>
            <tr><td><?= $m_num?> 미터(m)</td><td><?= $in_num?> 인치(in)</td></tr>
            <tr><td><?= $ft_num?> 피트(ft)</td><td><?= $yd_num?> 야드(yd)</td></tr>
        </table>
    </body>
</html>
