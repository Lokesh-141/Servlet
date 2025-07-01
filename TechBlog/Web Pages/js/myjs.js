function doLike(pid, uid) {
    console.log(pid + "," + uid);
    const d = {
        luid: uid,
        pid: pid,
        operation: 'like'
    };
    $.ajax({
        url: "LikeServlet",
        type: "POST",
        data: d,
        success: function (data, textStatus, jqXHR) {
            console.log(data);
            if (data.trim() == 'true') {
                let c = $(".like-counter").html();
                c++;
                $('.like-counter').html(c);
            }
        },
        error: function (jqXHR, textStatus, errorThrown) {
            console.error("AJAX Error:", jqXHR.status, textStatus, errorThrown);
            console.log("Server Response:", jqXHR.responseText);
        }

    });
}
