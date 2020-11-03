function mascaraCpf(mascara, input) {
    const vetMask = mascara.split(" ")
    const numCpf = input.value.replace(/\D/g, "")
    const cursor = Number(input.selectionStart)
    const tecla = (window.event) ? event.keyCode : event.which

    for(let i=0; i<numCpf.length; i++) {
        vetMask.splice(vetMask.indexOf(" "), 1, numCpf[i])
    }

    input.value = vetMask.join("")

    

}