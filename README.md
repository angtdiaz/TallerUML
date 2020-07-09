# TallerUML

Creacion de clases en código JAVA traduciendo el siguiente diagrama de clases.

![alt text](https://raw.githubusercontent.com/angtdiaz/TallerUML/master/SistemaClinico/sistemaClinicoDiagrama.jpg)



# Corresponde al siguiente caso:


Un paciente puede solicitar una cita médica y debe recibir un correo electrónico de confirmación con los datos de la cita. Cuando el paciente asiste a la cita, debe esperar en una sala de espera hasta que la secretaria verifique que su cita aún está activa (al menos 10 minutos antes de la hora de la cita) y recibe el pago de la cita. Luego, la secretaría lo deja pasar al consultorio del doctor cuando este se encuentre libre, es decir; sin otro paciente. Cuando el paciente es atendido por el doctor, en caso de necesitar medicinas, la receta la imprime el doctor y además se envía al correo electrónico del paciente. Por otro lado, el doctor puede añadir un plan nutricional en caso de que el paciente lo requiera.
El paciente después de ser atendido puede solicitar a la secretaria que le separe una nueva cita para otra fecha o la puede solicitar por su propia cuenta.
Por otro lado, el paciente también puede suspender su cita hasta 2 horas antes de la misma. El pago se puede realizar en efectivo, tarjeta de crédito/débito o PayPal.
Las consultas pueden ser a Medicina General con costo regular, o a un área específica (Endocrinología, Pediatría, Ginecología, Cardiología y Neurología) donde el costo de la consulta varia. También se cuenta con un registro de pacientes por área en la que ha sido atendido con el respectivo médico, hora, fecha y diagnóstico.
Para poder acceder al sistema se debe estar registrado, cada usuario necesita un correo electrónico y contraseña, además de nombre, apellido, edad, historia clínica (Enfermedades, alergias, etc). El doctor es quien puede registrar/eliminar a su secretaria, también existe un administrador que es quien puede registrar a todos los usuarios y les asigna el rol correspondiente. 
