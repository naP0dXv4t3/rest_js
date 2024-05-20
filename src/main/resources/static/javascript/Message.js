fetch("/message-data")
    .then(r => r.json())
    .then(message => {
        const requestTableBody = document.getElementById("RequestData");

        let requestRow = requestTableBody.insertRow();
        requestRow.insertCell().innerHTML = message.id;
        requestRow.insertCell().innerHTML = message.senderEmail;
        requestRow.insertCell().innerHTML = message.senderContact;
        requestRow.insertCell().innerHTML = message.messageText;

    })