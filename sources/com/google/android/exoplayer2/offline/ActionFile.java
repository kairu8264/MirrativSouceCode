package com.google.android.exoplayer2.offline;

import android.net.Uri;
import com.google.android.exoplayer2.offline.DownloadRequest;
import com.google.android.exoplayer2.util.AtomicFile;
import com.google.android.exoplayer2.util.MimeTypes;
import com.google.android.exoplayer2.util.Util;
import java.io.Closeable;
import java.io.DataInputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;

@Deprecated
/* loaded from: classes3.dex */
final class ActionFile {
    private static final String DOWNLOAD_TYPE_DASH = "dash";
    private static final String DOWNLOAD_TYPE_HLS = "hls";
    private static final String DOWNLOAD_TYPE_PROGRESSIVE = "progressive";
    private static final String DOWNLOAD_TYPE_SS = "ss";
    private static final int VERSION = 0;
    private final AtomicFile atomicFile;

    public ActionFile(File file) {
        this.atomicFile = new AtomicFile(file);
    }

    private static String generateDownloadId(Uri uri, String str) {
        return str != null ? str : uri.toString();
    }

    private static String inferMimeType(String str) {
        char c10;
        int hashCode = str.hashCode();
        if (hashCode == 3680) {
            if (str.equals(DOWNLOAD_TYPE_SS)) {
                c10 = 2;
            }
            c10 = 65535;
        } else if (hashCode == 103407) {
            if (str.equals("hls")) {
                c10 = 1;
            }
            c10 = 65535;
        } else if (hashCode != 3075986) {
            if (hashCode == 1131547531 && str.equals(DOWNLOAD_TYPE_PROGRESSIVE)) {
                c10 = 3;
            }
            c10 = 65535;
        } else {
            if (str.equals(DOWNLOAD_TYPE_DASH)) {
                c10 = 0;
            }
            c10 = 65535;
        }
        return c10 != 0 ? c10 != 1 ? c10 != 2 ? MimeTypes.VIDEO_UNKNOWN : MimeTypes.APPLICATION_SS : MimeTypes.APPLICATION_M3U8 : MimeTypes.APPLICATION_MPD;
    }

    private static DownloadRequest readDownloadRequest(DataInputStream dataInputStream) throws IOException {
        byte[] bArr;
        String readUTF = dataInputStream.readUTF();
        int readInt = dataInputStream.readInt();
        Uri parse = Uri.parse(dataInputStream.readUTF());
        boolean readBoolean = dataInputStream.readBoolean();
        int readInt2 = dataInputStream.readInt();
        String str = null;
        if (readInt2 != 0) {
            bArr = new byte[readInt2];
            dataInputStream.readFully(bArr);
        } else {
            bArr = null;
        }
        boolean z10 = true;
        boolean z11 = readInt == 0 && DOWNLOAD_TYPE_PROGRESSIVE.equals(readUTF);
        ArrayList arrayList = new ArrayList();
        if (!z11) {
            int readInt3 = dataInputStream.readInt();
            for (int i10 = 0; i10 < readInt3; i10++) {
                arrayList.add(readKey(readUTF, readInt, dataInputStream));
            }
        }
        if (readInt >= 2 || (!DOWNLOAD_TYPE_DASH.equals(readUTF) && !"hls".equals(readUTF) && !DOWNLOAD_TYPE_SS.equals(readUTF))) {
            z10 = false;
        }
        if (!z10 && dataInputStream.readBoolean()) {
            str = dataInputStream.readUTF();
        }
        String generateDownloadId = readInt < 3 ? generateDownloadId(parse, str) : dataInputStream.readUTF();
        if (!readBoolean) {
            return new DownloadRequest.Builder(generateDownloadId, parse).setMimeType(inferMimeType(readUTF)).setStreamKeys(arrayList).setCustomCacheKey(str).setData(bArr).build();
        }
        throw new DownloadRequest.UnsupportedRequestException();
    }

    private static StreamKey readKey(String str, int i10, DataInputStream dataInputStream) throws IOException {
        int i11;
        int readInt;
        int readInt2;
        if (("hls".equals(str) || DOWNLOAD_TYPE_SS.equals(str)) && i10 == 0) {
            i11 = 0;
            readInt = dataInputStream.readInt();
            readInt2 = dataInputStream.readInt();
        } else {
            i11 = dataInputStream.readInt();
            readInt = dataInputStream.readInt();
            readInt2 = dataInputStream.readInt();
        }
        return new StreamKey(i11, readInt, readInt2);
    }

    public void delete() {
        this.atomicFile.delete();
    }

    public boolean exists() {
        return this.atomicFile.exists();
    }

    public DownloadRequest[] load() throws IOException {
        if (exists()) {
            try {
                InputStream openRead = this.atomicFile.openRead();
                DataInputStream dataInputStream = new DataInputStream(openRead);
                int readInt = dataInputStream.readInt();
                if (readInt <= 0) {
                    int readInt2 = dataInputStream.readInt();
                    ArrayList arrayList = new ArrayList();
                    for (int i10 = 0; i10 < readInt2; i10++) {
                        try {
                            arrayList.add(readDownloadRequest(dataInputStream));
                        } catch (DownloadRequest.UnsupportedRequestException unused) {
                        }
                    }
                    DownloadRequest[] downloadRequestArr = (DownloadRequest[]) arrayList.toArray(new DownloadRequest[0]);
                    Util.closeQuietly(openRead);
                    return downloadRequestArr;
                }
                throw new IOException("Unsupported action file version: " + readInt);
            } catch (Throwable th2) {
                Util.closeQuietly((Closeable) null);
                throw th2;
            }
        }
        return new DownloadRequest[0];
    }
}
