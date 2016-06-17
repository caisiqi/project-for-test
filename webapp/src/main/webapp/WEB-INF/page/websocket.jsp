<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>WebSocket Test</title>
</head>
<body>
    <p>Click start button to test, client will send 10 request to server side, after 10 times, the websocket will be closed by client side. </p>
    <input type="button" onclick="testLoopWebSocket();" value="start"></input>
    <div id="output"></div>
</body>
<script language="javascript"type="text/javascript">  
    var wsUri ="ws://localhost:8080/webapp/websocket"; 
    var output;  
    
    function init() { 
        output = document.getElementById("output"); 
        //testWebSocket(); 
        //testLoopWebSocket();
    }  
 
    function testLoopWebSocket(){
        var websocket = new WebSocket(wsUri);
        var count = 1;
        var message = "message";
        websocket.onopen = function(event) { 
        	writeToScreen("CONNECTED");
        	writeToScreen("SENT: " + message);  
            websocket.send(message); 
        }; 
        websocket.onclose = function(event) { 
        	writeToScreen("DISCONNECTED");
        }; 
        websocket.onmessage = function(event) { 
        	if (count < 10) {
        		writeToScreen('<span style="color: blue;">RESPONSE: '+ event.data+'</span>'); 
                writeToScreen("SENT: " + message);  
                websocket.send(message);	
                count += 1;
        	} else {
        		  websocket.close(); 
        	}
        }; 
        websocket.onerror = function(event) { 
        	writeToScreen('<span style="color: red;">ERROR:</span> '+ event.data); 
        }; 
    }
    
    // Deprecated 
    function testWebSocket() { 
        websocket = new WebSocket(wsUri); 
        websocket.onopen = function(evt) { 
            onOpen(evt) 
        }; 
        websocket.onclose = function(evt) { 
            onClose(evt) 
        }; 
        websocket.onmessage = function(evt) { 
            onMessage(evt) 
        }; 
        websocket.onerror = function(evt) { 
            onError(evt) 
        }; 
    }  
    
    function onOpen(evt) { 
        writeToScreen("CONNECTED"); 
        doSend("WebSocket rocks"); 
    }  
 
    function onClose(evt) { 
        writeToScreen("DISCONNECTED"); 
    }  
 
    function onMessage(evt) { 
        writeToScreen('<span style="color: blue;">RESPONSE: '+ evt.data+'</span>'); 
        websocket.close(); 
    }  
 
    function onError(evt) { 
        writeToScreen('<span style="color: red;">ERROR:</span> '+ evt.data); 
    }  
 
    function doSend(message) { 
        writeToScreen("SENT: " + message);  
        websocket.send(message); 
    }  
 
    function writeToScreen(message) { 
        var pre = document.createElement("p"); 
        pre.style.wordWrap = "break-word"; 
        pre.innerHTML = message; 
        output.appendChild(pre); 
    }  
 
    window.addEventListener("load", init, false);  
</script>  
</html>