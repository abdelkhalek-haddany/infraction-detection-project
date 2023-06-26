var toggler = document.querySelector(".sidebar-toggler");
if (toggler) {
    toggler.addEventListener("click", (e) => {
        document.querySelector(".sidebar").classList.toggle("show");

        content_area = document.getElementById("content-area");
        if (content_area) {
            content_area.classList.toggle("no-sidebar");
            content_area.classList.toggle("active");
        }
    });
}