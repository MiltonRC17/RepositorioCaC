let usuarios = []
let edades = []

for (var i=0; i<1; i++){
    for(var a=0; a<3; a++){
        usuarios[i,a]=prompt('Ingrese el Nombre ' + (a+1))
        edades[i,a]=parseInt(prompt('Ingrese la edad ' + (a+1)))
    }
}

for(var i=0; i<3; i++){
    if (edades[0,i]>=18){
        alert(usuarios[0,i] + ' es mayor de edad')       
    }else{
        alert(usuarios[0,i] + ' no es mayor de edad')
    }
}

var i=0
    if (edades[i]>edades[i+1] && edades[i]>edades[i+2]){
        alert(usuarios[0,i] + ' es mayor con ' + edades[0,i])
    }else{
        if (edades[i+1]>edades[i] && edades[i+1]>edades[i+2]){
            alert(usuarios[i+1] + ' es mayor con ' + edades[i+1])
        }else{
            alert(usuarios[i+2] + ' es mayor con ' + edades[i+2])
        }
    }
