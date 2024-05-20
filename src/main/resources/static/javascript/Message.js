function showMessage() {
        const tableBody = document.getElementById("RequestData");
        fetch("/message-data")
            .then(r => r.json())
            .then(messages => {
                    tableBody.innerHTML = '';
                    for (const message of messages) {
                            let requestRow = requestTableBody.insertRow();
                            requestRow.insertCell().innerHTML = message.id;
                            requestRow.insertCell().innerHTML = message.senderEmail;
                            requestRow.insertCell().innerHTML = message.senderContact;
                            requestRow.insertCell().innerHTML = message.messageText;
                    }
            })
            .catch(err => console.log(err));
}