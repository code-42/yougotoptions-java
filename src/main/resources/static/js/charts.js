var pageCounter = 1;
var chartData = document.getElementById("chart-data");

var symbol = document.getElementById("symbol");

symbol.addEventListener("click",function(){
    var myRequest = new XMLHttpRequest();
    myRequest.open('GET','https://learnwebcode.github.io/json-example/animals-' + pageCounter + '.json');
    myRequest.onload = function(){
        var myData = JSON.parse(myRequest.responseText);
        for (i = 0; i < myData.length; i++){
            console.log(myData[i]);
        }

         chartData.innerHTML = ""; //put animated gif for loading data...
        renderHTML(myData);
    };

    myRequest.onerror = function(){
        alert("Connection error");
    }

    myRequest.send();
    pageCounter++;
    if(pageCounter > 3){
        pageCounter = 1;
    }
});

function renderHTML(data){

    var htmlString = "";

    for (i = 0; i < data.length; i++){
        htmlString += "<p>" + data[i].name + " is a " + data[i].species + ".</p>";
    }

    chartData.insertAdjacentHTML('beforeend', htmlString);
}

