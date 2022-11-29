package x4;

import android.database.AbstractWindowedCursor;
import android.database.Cursor;
import android.os.Build;
import android.os.CancellationSignal;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.util.ArrayList;
import v4.q0;
import z4.j;

/* loaded from: classes.dex */
public class c {
    public static void a(z4.g gVar) {
        ArrayList<String> arrayList = new ArrayList();
        Cursor p12 = gVar.p1("SELECT name FROM sqlite_master WHERE type = 'trigger'");
        while (p12.moveToNext()) {
            try {
                arrayList.add(p12.getString(0));
            } catch (Throwable th2) {
                p12.close();
                throw th2;
            }
        }
        p12.close();
        for (String str : arrayList) {
            if (str.startsWith("room_fts_content_sync_")) {
                gVar.B("DROP TRIGGER IF EXISTS " + str);
            }
        }
    }

    public static Cursor b(q0 q0Var, j jVar, boolean z10, CancellationSignal cancellationSignal) {
        Cursor z11 = q0Var.z(jVar, cancellationSignal);
        if (z10 && (z11 instanceof AbstractWindowedCursor)) {
            AbstractWindowedCursor abstractWindowedCursor = (AbstractWindowedCursor) z11;
            int count = abstractWindowedCursor.getCount();
            return (Build.VERSION.SDK_INT < 23 || (abstractWindowedCursor.hasWindow() ? abstractWindowedCursor.getWindow().getNumRows() : count) < count) ? b.a(abstractWindowedCursor) : z11;
        }
        return z11;
    }

    public static int c(File file) throws IOException {
        FileChannel fileChannel = null;
        try {
            ByteBuffer allocate = ByteBuffer.allocate(4);
            FileChannel channel = new FileInputStream(file).getChannel();
            channel.tryLock(60L, 4L, true);
            channel.position(60L);
            if (channel.read(allocate) == 4) {
                allocate.rewind();
                int i10 = allocate.getInt();
                channel.close();
                return i10;
            }
            throw new IOException("Bad database header, unable to read 4 bytes at offset 60");
        } catch (Throwable th2) {
            if (0 != 0) {
                fileChannel.close();
            }
            throw th2;
        }
    }
}
