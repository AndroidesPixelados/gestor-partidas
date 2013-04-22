/**
 *
 */
package es.androidespixelados.gestorpartida.persistencia;

import java.util.HashMap;
import java.util.Map;

import android.content.ContentResolver;
import android.database.CharArrayBuffer;
import android.database.ContentObserver;
import android.database.Cursor;
import android.database.DataSetObserver;
import android.net.Uri;
import android.os.Bundle;

/**
 * La implementación del decorador de Cursor.
 * Implementa los métodos de obtención de datos primitivos por nombre de columna
 * en vez de por índice de columna. El resto de métodos son delegados en el cursor
 * al que decora.
 * 
 * La relación entre nombre de columna e índice es cacheada cuando se construye el objeto,
 * por lo que el Cursor que se le pase al constructor debe de ser un cursor válido y abierto.
 * 
 * @author Loïc Prieto.
 * 
 */
public class DecoradorCursorAP implements CursorAP {

	/**
	 * El cursor de origen al que complementa este.
	 */
	private Cursor					cursorDecorado;

	/**
	 * Caché de mapeos entre nombres e índices de columna.
	 */
	private Map<String, Integer>	mapeosNombreColumna;

	/**
	 * El constructor del decorador necesita el cursor de origen.
	 */
	public DecoradorCursorAP(Cursor cursorDecorado) {
		this.cursorDecorado = cursorDecorado;

		// Cachea el mapeo entre nombre de columna e índice de columna.
		this.mapeosNombreColumna = new HashMap<String, Integer>();
		String[] nombresColumnas = this.cursorDecorado.getColumnNames();
		int indice = 0;
		for (String nombreColumna : nombresColumnas) {
			mapeosNombreColumna.put(nombreColumna, indice++);
		}
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void close() {
		cursorDecorado.close();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void copyStringToBuffer(int columnIndex, CharArrayBuffer buffer) {
		cursorDecorado.copyStringToBuffer(columnIndex, buffer);
	}

	/**
	 * Desactiva el cursor. Método abandonado.
	 * 
	 * @deprecated método abandonado.
	 */
	@Override
	@Deprecated
	public void deactivate() {
		cursorDecorado.deactivate();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public byte[] getBlob(int columnIndex) {
		return cursorDecorado.getBlob(columnIndex);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public int getColumnCount() {
		return cursorDecorado.getColumnCount();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public int getColumnIndex(String columnName) {
		return cursorDecorado.getColumnIndex(columnName);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public int getColumnIndexOrThrow(String columnName) throws IllegalArgumentException {
		return cursorDecorado.getColumnIndexOrThrow(columnName);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String getColumnName(int columnIndex) {
		return cursorDecorado.getColumnName(columnIndex);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String[] getColumnNames() {
		return cursorDecorado.getColumnNames();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public int getCount() {
		return cursorDecorado.getCount();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public double getDouble(int columnIndex) {
		return cursorDecorado.getDouble(columnIndex);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Bundle getExtras() {
		return cursorDecorado.getExtras();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public float getFloat(int columnIndex) {
		return cursorDecorado.getFloat(columnIndex);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public int getInt(int columnIndex) {
		return cursorDecorado.getInt(columnIndex);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public long getLong(int columnIndex) {
		return cursorDecorado.getLong(columnIndex);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public int getPosition() {
		return cursorDecorado.getPosition();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public short getShort(int columnIndex) {
		return cursorDecorado.getShort(columnIndex);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String getString(int columnIndex) {
		return cursorDecorado.getString(columnIndex);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public int getType(int columnIndex) {
		return cursorDecorado.getType(columnIndex);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public boolean getWantsAllOnMoveCalls() {
		return cursorDecorado.getWantsAllOnMoveCalls();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public boolean isAfterLast() {
		return cursorDecorado.isAfterLast();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public boolean isBeforeFirst() {
		return cursorDecorado.isBeforeFirst();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public boolean isClosed() {
		return cursorDecorado.isClosed();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public boolean isFirst() {
		return cursorDecorado.isFirst();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public boolean isLast() {
		return cursorDecorado.isLast();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public boolean isNull(int columnIndex) {
		return cursorDecorado.isNull(columnIndex);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public boolean move(int offset) {
		return cursorDecorado.move(offset);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public boolean moveToFirst() {
		return cursorDecorado.moveToFirst();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public boolean moveToLast() {
		return cursorDecorado.moveToLast();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public boolean moveToNext() {
		return cursorDecorado.moveToNext();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public boolean moveToPosition(int position) {
		return cursorDecorado.moveToPosition(position);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public boolean moveToPrevious() {
		return cursorDecorado.moveToPrevious();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void registerContentObserver(ContentObserver observer) {
		cursorDecorado.registerContentObserver(observer);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void registerDataSetObserver(DataSetObserver observer) {
		cursorDecorado.registerDataSetObserver(observer);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @deprecated deprecated.
	 */
	@Override
	@Deprecated
	public boolean requery() {
		return cursorDecorado.requery();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Bundle respond(Bundle extras) {
		return cursorDecorado.respond(extras);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void setNotificationUri(ContentResolver cr, Uri uri) {
		cursorDecorado.setNotificationUri(cr, uri);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void unregisterContentObserver(ContentObserver observer) {
		cursorDecorado.unregisterContentObserver(observer);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void unregisterDataSetObserver(DataSetObserver observer) {
		cursorDecorado.unregisterDataSetObserver(observer);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String getString(String nombreColumna) {
		return cursorDecorado.getString(mapeosNombreColumna.get(nombreColumna));
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public long getLong(String nombreColumna) {
		return cursorDecorado.getLong(mapeosNombreColumna.get(nombreColumna));
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public int getInt(String nombreColumna) {
		return cursorDecorado.getInt(mapeosNombreColumna.get(nombreColumna));
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public float getFloat(String nombreColumna) {
		return cursorDecorado.getFloat(mapeosNombreColumna.get(nombreColumna));
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public double getDouble(String nombreColumna) {
		return cursorDecorado.getDouble(mapeosNombreColumna.get(nombreColumna));
	}

}
