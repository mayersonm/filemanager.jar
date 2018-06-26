<h1>Java FileManager</h1>
<p>
	Implementación de rutinas para gestionar archivos.
</p>


<div>
	<h3>Clase FileSystem</h3>
	<p>
		Implementación de operaciones sobre archivos en el File System de la PC.
	</p>
	<table>
		<thead>
			<tr>
				<th>Metodo</th>
				<th>Descripcion</th>
				<th>Entradas</th>
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
