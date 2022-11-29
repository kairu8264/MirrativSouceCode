package dk;

import androidx.appcompat.widget.ListPopupWindow;
import com.google.android.play.core.internal.zzck;
import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* loaded from: classes3.dex */
public final class y {
    public static long a(z zVar, InputStream inputStream, OutputStream outputStream, long j10) throws IOException {
        byte[] bArr = new byte[16384];
        DataInputStream dataInputStream = new DataInputStream(new BufferedInputStream(inputStream, 4096));
        int readInt = dataInputStream.readInt();
        if (readInt != -771763713) {
            String valueOf = String.valueOf(String.format("%x", Integer.valueOf(readInt)));
            throw new zzck(valueOf.length() != 0 ? "Unexpected magic=".concat(valueOf) : new String("Unexpected magic="));
        }
        int read = dataInputStream.read();
        if (read != 4) {
            StringBuilder sb2 = new StringBuilder(30);
            sb2.append("Unexpected version=");
            sb2.append(read);
            throw new zzck(sb2.toString());
        }
        long j11 = 0;
        while (true) {
            long j12 = j10 - j11;
            try {
                int read2 = dataInputStream.read();
                if (read2 == -1) {
                    throw new IOException("Patch file overrun");
                }
                if (read2 == 0) {
                    return j11;
                }
                switch (read2) {
                    case 247:
                        read2 = dataInputStream.readUnsignedShort();
                        c(bArr, dataInputStream, outputStream, read2, j12);
                        break;
                    case 248:
                        read2 = dataInputStream.readInt();
                        c(bArr, dataInputStream, outputStream, read2, j12);
                        break;
                    case 249:
                        long readUnsignedShort = dataInputStream.readUnsignedShort();
                        read2 = dataInputStream.read();
                        if (read2 != -1) {
                            b(bArr, zVar, outputStream, readUnsignedShort, read2, j12);
                            break;
                        } else {
                            throw new IOException("Unexpected end of patch");
                        }
                    case ListPopupWindow.EXPAND_LIST_TIMEOUT /* 250 */:
                        read2 = dataInputStream.readUnsignedShort();
                        b(bArr, zVar, outputStream, dataInputStream.readUnsignedShort(), read2, j12);
                        break;
                    case 251:
                        read2 = dataInputStream.readInt();
                        b(bArr, zVar, outputStream, dataInputStream.readUnsignedShort(), read2, j12);
                        break;
                    case 252:
                        long readInt2 = dataInputStream.readInt();
                        read2 = dataInputStream.read();
                        if (read2 != -1) {
                            b(bArr, zVar, outputStream, readInt2, read2, j12);
                            break;
                        } else {
                            throw new IOException("Unexpected end of patch");
                        }
                    case 253:
                        read2 = dataInputStream.readUnsignedShort();
                        b(bArr, zVar, outputStream, dataInputStream.readInt(), read2, j12);
                        break;
                    case 254:
                        read2 = dataInputStream.readInt();
                        b(bArr, zVar, outputStream, dataInputStream.readInt(), read2, j12);
                        break;
                    case 255:
                        long readLong = dataInputStream.readLong();
                        read2 = dataInputStream.readInt();
                        b(bArr, zVar, outputStream, readLong, read2, j12);
                        break;
                    default:
                        c(bArr, dataInputStream, outputStream, read2, j12);
                        break;
                }
                j11 += read2;
            } finally {
                outputStream.flush();
            }
        }
    }

    public static void b(byte[] bArr, z zVar, OutputStream outputStream, long j10, int i10, long j11) throws IOException {
        if (i10 < 0) {
            throw new IOException("copyLength negative");
        }
        if (j10 < 0) {
            throw new IOException("inputOffset negative");
        }
        long j12 = i10;
        if (j12 <= j11) {
            try {
                InputStream d10 = new a0(zVar, j10, j12).d();
                while (i10 > 0) {
                    int min = Math.min(i10, 16384);
                    int i11 = 0;
                    while (i11 < min) {
                        int read = d10.read(bArr, i11, min - i11);
                        if (read == -1) {
                            throw new IOException("truncated input stream");
                        }
                        i11 += read;
                    }
                    outputStream.write(bArr, 0, min);
                    i10 -= min;
                }
                d10.close();
                return;
            } catch (EOFException e10) {
                throw new IOException("patch underrun", e10);
            }
        }
        throw new IOException("Output length overrun");
    }

    public static void c(byte[] bArr, DataInputStream dataInputStream, OutputStream outputStream, int i10, long j10) throws IOException {
        if (i10 < 0) {
            throw new IOException("copyLength negative");
        }
        if (i10 > j10) {
            throw new IOException("Output length overrun");
        }
        while (i10 > 0) {
            try {
                int min = Math.min(i10, 16384);
                dataInputStream.readFully(bArr, 0, min);
                outputStream.write(bArr, 0, min);
                i10 -= min;
            } catch (EOFException unused) {
                throw new IOException("patch underrun");
            }
        }
    }
}
