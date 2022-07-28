var table_seat = document.querySelector('.table_seat');
var next_bt = document.getElementById('submit_bt');
var sub_bt = document.getElementById('sub');
var bill_chang = document.querySelector('.buy');
var each_ticket = 10000;
var ticket_bill = document.getElementById('money');
var count = 0;
var ticket_dict_list = [];
var title = 'title';
var time = 'time';
var a_i = document.getElementById('another');
var re_bt = document.getElementById('form_reset_btn');


function cl(doc, btn, t_bt1, t_bt22)
{
    var doc_info = document.querySelector(doc);
    var btn_n = document.getElementById(btn);
    var t_bt1 = document.getElementById(t_bt1);
    if(t_bt22 != "none")
    {
        var t_bt2 = document.getElementById(t_bt22);
    }
    
    if(doc_info.style.display == 'none')
    {
        doc_info.style.display = 'block';
        btn_n.style.color = 'black';
        btn_n.style.backgroundColor = 'rgb(207, 207, 207)';
        t_bt1.style.display = 'block';
        if(t_bt22 !="none")
        {
            t_bt2.style.display = 'block';
        }
    }
    else
    {
        doc_info.style.display = 'none';
        btn_n.style.color = 'gray';
        btn_n.style.backgroundColor = '#fff'
        t_bt1.style.display = 'none';
        if(t_bt22 != "none")
        {
            t_bt2.style.display = 'none';
        }
    }
}

function cl_bt(bt)
{
    var btn = document.getElementById(bt);
    if(bt.indexOf('f1') != -1)
    {
        title = '이터널스';
        time = btn.innerText;
    }
    else if(bt.indexOf('f2') != -1)
    {
        title = '듄';
        time = btn.innerText;
    }
    else if(bt.indexOf('f3') != -1){
        title = '강릉';
        time = btn.innerText;
    }
    else if(bt.indexOf('f4') != -1)
    {
        title = '아담스 패밀리 2';
        time = btn.innerText;
    }
    else if(bt.indexOf('f5') != -1)
    {
        title = '왕십리 김종분';
        time = btn.innerText;
    }
    else if(bt.indexOf('f6') != -1)
    {
        title = '틱, 틱 붐!';
        time = btn.innerText;
    }
    else if(bt.indexOf('f7') != -1)
    {
        title = '베놈 2';
        time = btn.innerText;
    }
    
    table_seat.style.display = 'block';
    next_bt.style.display = 'block';
}

function table_bt(r, h, f, s)
{   
    var table = document.querySelector('.table_time');
    var seat = f + '-' + s;
    if(table.rows[r-1].cells[h].style.backgroundColor=="white")
    {
        table.rows[r-1].cells[h].style.backgroundColor="gray";
        count += 2;
        /* A-2 선택시 r=1 , h=2 나옴.
        alert(r);
        alert(h);
        */
       ticket_dict_list.push({f_title:title, f_seat:seat, f_time:time, f_bill:'10,000'});
    }
    else{
        table.rows[r-1].cells[h].style.backgroundColor="white";
        
        for(var i =0; i<ticket_dict_list.length; i++)
        {
            if(ticket_dict_list[i]['f_seat'] == seat)
            {
                ticket_dict_list.splice(i, 1);
                count -= 1;
            }
        }
    }
    console.log(ticket_dict_list);
}

function bill()
{
    ticket_bill.innerHTML = String(( ticket_dict_list.length * each_ticket));
}

next_bt.addEventListener('click', function()
{
    bill();
    bill_chang.style.display = 'block';
    sub_bt.style.display = 'block';

});

sub_bt.addEventListener('click', function()
{
    for(var k in ticket_dict_list)
    {
        var buying_list = ticket_dict_list[k];

        window.localStorage.setItem(buying_list['f_title']+' '+buying_list['f_seat'], buying_list['f_time']+' '+buying_list['f_bill']);
    
    }
    a_i.style.display = 'block';
})


