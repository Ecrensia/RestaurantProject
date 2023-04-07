$( function() {
    $("#tab_2").hide();
    $("#tab_3").hide();

    $(".tabs li").click(function() {
        var idx = $(this).index();
        $(".tabs li").removeClass("current");
        $(".tabs li").eq(idx).addClass("current");
        $(".tab_content_container > div").hide();
        $(".tab_content_container > div").eq(idx).show();
      })
}
);