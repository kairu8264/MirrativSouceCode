package v4;

import android.content.Context;
import android.util.Log;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.channels.Channels;
import java.nio.channels.ReadableByteChannel;
import java.util.concurrent.Callable;
import v4.q0;

/* loaded from: classes.dex */
public class u0 implements z4.h, r {
    public final int A;
    public final z4.h B;
    public q C;
    public boolean D;

    /* renamed from: w  reason: collision with root package name */
    public final Context f56723w;

    /* renamed from: x  reason: collision with root package name */
    public final String f56724x;

    /* renamed from: y  reason: collision with root package name */
    public final File f56725y;

    /* renamed from: z  reason: collision with root package name */
    public final Callable<InputStream> f56726z;

    public u0(Context context, String str, File file, Callable<InputStream> callable, int i10, z4.h hVar) {
        this.f56723w = context;
        this.f56724x = str;
        this.f56725y = file;
        this.f56726z = callable;
        this.A = i10;
        this.B = hVar;
    }

    @Override // v4.r
    public z4.h a() {
        return this.B;
    }

    public final void c(File file, boolean z10) throws IOException {
        ReadableByteChannel newChannel;
        if (this.f56724x != null) {
            newChannel = Channels.newChannel(this.f56723w.getAssets().open(this.f56724x));
        } else if (this.f56725y != null) {
            newChannel = new FileInputStream(this.f56725y).getChannel();
        } else {
            Callable<InputStream> callable = this.f56726z;
            if (callable != null) {
                try {
                    newChannel = Channels.newChannel(callable.call());
                } catch (Exception e10) {
                    throw new IOException("inputStreamCallable exception on call", e10);
                }
            } else {
                throw new IllegalStateException("copyFromAssetPath, copyFromFile and copyFromInputStream are all null!");
            }
        }
        File createTempFile = File.createTempFile("room-copy-helper", ".tmp", this.f56723w.getCacheDir());
        createTempFile.deleteOnExit();
        x4.d.a(newChannel, new FileOutputStream(createTempFile).getChannel());
        File parentFile = file.getParentFile();
        if (parentFile != null && !parentFile.exists() && !parentFile.mkdirs()) {
            throw new IOException("Failed to create directories for " + file.getAbsolutePath());
        }
        d(createTempFile, z10);
        if (createTempFile.renameTo(file)) {
            return;
        }
        throw new IOException("Failed to move intermediate file (" + createTempFile.getAbsolutePath() + ") to destination (" + file.getAbsolutePath() + ").");
    }

    @Override // z4.h, java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() {
        this.B.close();
        this.D = false;
    }

    public final void d(File file, boolean z10) {
        q qVar = this.C;
        if (qVar != null) {
            q0.e eVar = qVar.f56655f;
        }
    }

    public void e(q qVar) {
        this.C = qVar;
    }

    @Override // z4.h
    public String getDatabaseName() {
        return this.B.getDatabaseName();
    }

    @Override // z4.h
    public synchronized z4.g getReadableDatabase() {
        if (!this.D) {
            h(false);
            this.D = true;
        }
        return this.B.getReadableDatabase();
    }

    @Override // z4.h
    public synchronized z4.g getWritableDatabase() {
        if (!this.D) {
            h(true);
            this.D = true;
        }
        return this.B.getWritableDatabase();
    }

    public final void h(boolean z10) {
        String databaseName = getDatabaseName();
        File databasePath = this.f56723w.getDatabasePath(databaseName);
        q qVar = this.C;
        x4.a aVar = new x4.a(databaseName, this.f56723w.getFilesDir(), qVar == null || qVar.f56662m);
        try {
            aVar.b();
            if (!databasePath.exists()) {
                try {
                    c(databasePath, z10);
                    aVar.c();
                    return;
                } catch (IOException e10) {
                    throw new RuntimeException("Unable to copy database file.", e10);
                }
            } else if (this.C == null) {
                aVar.c();
                return;
            } else {
                try {
                    int c10 = x4.c.c(databasePath);
                    int i10 = this.A;
                    if (c10 == i10) {
                        aVar.c();
                        return;
                    } else if (this.C.a(c10, i10)) {
                        aVar.c();
                        return;
                    } else {
                        if (this.f56723w.deleteDatabase(databaseName)) {
                            try {
                                c(databasePath, z10);
                            } catch (IOException e11) {
                                Log.w("ROOM", "Unable to copy database file.", e11);
                            }
                        } else {
                            Log.w("ROOM", "Failed to delete database file (" + databaseName + ") for a copy destructive migration.");
                        }
                        aVar.c();
                        return;
                    }
                } catch (IOException e12) {
                    Log.w("ROOM", "Unable to read database version.", e12);
                    aVar.c();
                    return;
                }
            }
        } catch (Throwable th2) {
            aVar.c();
            throw th2;
        }
        aVar.c();
        throw th2;
    }

    @Override // z4.h
    public void setWriteAheadLoggingEnabled(boolean z10) {
        this.B.setWriteAheadLoggingEnabled(z10);
    }
}
