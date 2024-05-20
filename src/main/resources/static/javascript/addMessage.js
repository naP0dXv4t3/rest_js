const requestForm = document.forms.namedItem("requestForm");
requestForm.addEventListener("submit", add);

function add(e) {
    e.preventDefault();
    fetch('/addMessage', {
        method: 'POST',
        headers: {
            'Content-Type': 'application/json',
        }, body: JSON.stringify({
            senderContact: requestForm.elements.namedItem("senderContact").value,
            senderEmail: requestForm.elements.namedItem("SenderEmail").value,
            messageText: requestForm.elements.namedItem("messageText").value
        })
    }).then( r=>{
        if (!r.ok) {
            throw new Error('Network response was not ok ' + response.statusText);
        }
        return r.json();
    })

}