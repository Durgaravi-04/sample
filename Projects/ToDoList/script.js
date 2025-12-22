const input = document.getElementById("taskinput");
const button = document.getElementById("addbutton");
const list = document.getElementById("tasklist");

button.addEventListener("click", function () {
    const task = input.value;

    if (input.value === "") {
        alert("Please Enter the List");
        return;
    }
    const li = document.createElement("li");
    li.textContent = task;

    const deleteBtn = document.createElement("button");
    deleteBtn.textContent = "X";
    deleteBtn.className = "delete-btn";

    deleteBtn.addEventListener("click", function () {
        li.remove();
    });

    li.appendChild(deleteBtn);
    list.appendChild(li);
    input.value = " ";


})