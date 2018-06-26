<h1>Java FileManager</h1>
<p>
	Implementación de rutinas para gestionar archivos.
</p>

<br><br>

<div>
	<h3>Clase FileSystem</h3>
	<p>
		Implementación de operaciones sobre archivos en el File System de la PC.
	</p>
	<table>
		<thead>
			<tr>
				<th>Método</th>
				<th>Descripción</th>
				<th>Parámetros</th>
				<th>Retorno</th>
			</tr>
		</thead>
		<tbody>
			<tr>
				<td>cp</td>
				<td>
					Metodo para copiar un archivo.
				</td>
				<td>
					<p>
						<strong>String pathNameSource</strong>
						<p>
							Ruta y nombre de archivo que se desea copiar.
						</p>
					</p>
					<p>
						<strong>String pathNameDest</strong>
						<p>
							Ruta y nombre del archivo donde será copiado.
						</p>
					</p>
				</td>
				<td>
					<strong>boolean</strong>
					<p>
						Identifica si el archivo fue copiado.
					</p>
				</td>
			</tr>

			<tr>
				<td>mv</td>
				<td>
					Metodo para mover un archivo.
				</td>
				<td>
					<p>
						<strong>String sourceFile</strong>
						<p>
							Ruta y nombre de archivo que se desea mover.
						</p>
					</p>
					<p>
						<strong>String destFile</strong>
						<p>
							Ruta y nombre del archivo donde será movido.
						</p>
					</p>
				</td>
				<td>
					<strong>boolean</strong>
					<p>
						Identifica si el archivo fue movido.
					</p>
				</td>
			</tr>

			<tr>
				<td>rm</td>
				<td>
					Metodo para borrar un archivo.
				</td>
				<td>
					<p>
						<strong>String pathName</strong>
						<p>
							Ruta y nombre de archivo a borrar.
						</p>
					</p>
				</td>
				<td>
					<strong>boolean</strong>
					<p>
						Identifica si el archivo fue borrado.
					</p>
				</td>
			</tr>

			<tr>
				<td>ls</td>
				<td>
					Metodo que lista los archivos y carpetas de una ruta especifica.
				</td>
				<td>
					<p>
						<strong>String path</strong>
						<p>
							Ruta donde se buscarán los archivos y carpetas.
						</p>
					</p>
				</td>
				<td>
					<strong>String[]</strong>
					<p>
						Array de <strong>String</strong> con los nombres de archivos encontrados.
					</p>
				</td>
			</tr>
		</tbody>
	</table>
</div>

<br><br>

<div>
	<h3>Clase FileSFTP</h3>
	<p>
		Implemenatación de operaciones para transferencia de archivos a través de SFTP.
	</p>
	<table>
		<thead>
			<tr>
				<th>Método</th>
				<th>Descripción</th>
				<th>Parámetros</th>
				<th>Retorno</th>
			</tr>
		</thead>
		<tbody>
			<tr>
				<td>FileSFTP</td>
				<td>
					Constructor.
				</td>
				<td>
					<p>
						<strong>String host</strong>
						<div>
							Ip o nombre del equipo con el servidor SFTP.
						</div>
					</p>
					<p>
						<strong>int port</strong>
						<div>
							Número de puerto del servidor SFTP.
						</div>
					</p>
					<p>
						<strong>String user</strong>
						<div>
							Usuario de acceso al servidor SFTP.
						</div>
					</p>
					<p>
						<strong>String password</strong>
						<div>
							Password de acceso al servidor SFTP.
						</div>
					</p>
				</td>
				<td></td>
			</tr>
			<tr>
				<td>connect</td>
				<td>
					Establece conexión con el servidor SFTP.
				</td>
				<td>
					Sin parámetros.
				</td>
				<td>
					void
				</td>
			</tr>
			<tr>
				<td>disconect</td>
				<td>
					Termina la conexión con el servidor SFTP.
				</td>
				<td>
					Sin parámetros.
				</td>
				<td>
					void
				</td>
			</tr>
			<tr>
				<td>isConected</td>
				<td>
					Verifica si se encuentra conectado al servidor SFTP.
				</td>
				<td>
					Sin parámetros.
				</td>
				<td>
					<strong>boolean</strong>
					<p>
						true, si se encuentra conectado al servidor SFTP.
					</p>
				</td>
			</tr>
			<tr>
				<td>put</td>
				<td>
					Metodo para cargar un archivo al servidor SFTP.
				</td>
				<td>
					<p>
						<strong>String filePath</strong>
						<p>
							Ruta y nombre del archivo en el FileSystem de la PC.
						</p>
					</p>
					<p>
						<strong>String ftpPath</strong>
						<p>
							Ruta y nombre del archivo en el servidor SFTP, dónde se subirá el archivo.
						</p>
					</p>
				</td>
				<td>
					<strong>boolean</strong>
					<p>
						Identifica si el archivo fue cargado al servidor SFTP.
					</p>
				</td>
			</tr>
			<tr>
				<td>get</td>
				<td>
					Metodo para descargar un archivo del servidor SFTP.
				</td>
				<td>
					<p>
						<strong>String ftpPath</strong>
						<p>
							Ruta y nombre del archivo en el servidor SFTP, de donde se descargará el archivo.
						</p>
					</p>
					<p>
						<strong>String filePath</strong>
						<p>
							Ruta y nombre del archivo donde será descargado en la PC.
						</p>
					</p>
				</td>
				<td>
					<strong>boolean</strong>
					<p>
						Identifica si el archivo fue descargado al servidor SFTP.
					</p>
				</td>
			</tr>
			<tr>
				<td>ls</td>
				<td>
					Metodo que lista los archivos y carpetas en el servidor SFTP.
				</td>
				<td>
					<p>
						<strong>String path</strong>
						<p>
							Ruta donde se buscarán los archivos y carpetas en el servidor SFTP.
						</p>
					</p>
				</td>
				<td>
					<strong>String[]</strong>
					<p>
						Array de <strong>String</strong> con los nombres de archivos encontrados.
					</p>
				</td>
			</tr>
		</tbody>
	</table>
</div>