<head>
    <meta charset="UTF-8">
</head>

<body>
    <?php
        $area = $_REQUEST['area'];
    ?>
    <h2>수도권 날씨예보</h2>
    <form name="f1" id="f1" method="post" >
        <select name="area" id="f2" onchange="this.form.submit()" autofocus>
            <option value="과천" selected<?php if($area == "과천") echo "selected";?>>과천</option>
            <option value="서울" <?php if($area == "서울") echo "selected";?>>서울</option>
            <option value="성남" <?php if($area == "성남") echo "selected";?>>성남</option>
            <option value="수원" <?php if($area == "수원") echo "selected";?>>수원</option>
            <option value="용인" <?php if($area == "용인") echo "selected";?>>용인</option>
            <option value="인천" <?php if($area == "인천") echo "selected";?>>인천</option>
        </select>
        <span>&nbsp;의 날씨는?</span>
    </form>

    <?php
        $area = $_POST["area"];
        $con = mysqli_connect("localhost", "user1", "12345", "sample");
        $sql = "SELECT *from weather where city = '$area'";

        $result = mysqli_query($con, $sql)or die (mysqli_error($con));
    ?>

        <h2><?=$area?>의 날씨</h2>

    <?php
        while($row = mysqli_fetch_array($result)){
            echo "최고 기온 ".$row['high_temp']."도<br>";
            echo "최저 기온 ".$row['low_temp']."도<br>";
            echo "비올 확률 ".$row['rain_ratio']."%<br>";
            echo "예상 강수량 ".$row['rain_mm']."mm<br>";
        }       
    ?>
</body>
