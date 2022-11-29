package ai;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.Bundle;
import com.google.android.gms.internal.ads.zzkl;
import com.mirrativ.llstream.protocol.v1.topic.TopicConstant;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.channels.FileChannel;

/* loaded from: classes3.dex */
public final class gs3 extends z4 {

    /* renamed from: e  reason: collision with root package name */
    public final ContentResolver f4563e;

    /* renamed from: f  reason: collision with root package name */
    public Uri f4564f;

    /* renamed from: g  reason: collision with root package name */
    public AssetFileDescriptor f4565g;

    /* renamed from: h  reason: collision with root package name */
    public FileInputStream f4566h;

    /* renamed from: i  reason: collision with root package name */
    public long f4567i;

    /* renamed from: j  reason: collision with root package name */
    public boolean f4568j;

    public gs3(Context context) {
        super(false);
        this.f4563e = context.getContentResolver();
    }

    @Override // ai.a6
    public final int b(byte[] bArr, int i10, int i11) throws zzkl {
        if (i11 == 0) {
            return 0;
        }
        long j10 = this.f4567i;
        if (j10 != 0) {
            if (j10 != -1) {
                try {
                    i11 = (int) Math.min(j10, i11);
                } catch (IOException e10) {
                    throw new zzkl(e10, 2000);
                }
            }
            FileInputStream fileInputStream = this.f4566h;
            int i12 = sb.f9778a;
            int read = fileInputStream.read(bArr, i10, i11);
            if (read == -1) {
                return -1;
            }
            long j11 = this.f4567i;
            if (j11 != -1) {
                this.f4567i = j11 - read;
            }
            s(read);
            return read;
        }
        return -1;
    }

    @Override // ai.a8
    public final void g() throws zzkl {
        this.f4564f = null;
        try {
            try {
                FileInputStream fileInputStream = this.f4566h;
                if (fileInputStream != null) {
                    fileInputStream.close();
                }
                this.f4566h = null;
                try {
                    try {
                        AssetFileDescriptor assetFileDescriptor = this.f4565g;
                        if (assetFileDescriptor != null) {
                            assetFileDescriptor.close();
                        }
                    } catch (IOException e10) {
                        throw new zzkl(e10, 2000);
                    }
                } finally {
                    this.f4565g = null;
                    if (this.f4568j) {
                        this.f4568j = false;
                        t();
                    }
                }
            } catch (Throwable th2) {
                this.f4566h = null;
                try {
                    try {
                        AssetFileDescriptor assetFileDescriptor2 = this.f4565g;
                        if (assetFileDescriptor2 != null) {
                            assetFileDescriptor2.close();
                        }
                        this.f4565g = null;
                        if (this.f4568j) {
                            this.f4568j = false;
                            t();
                        }
                        throw th2;
                    } catch (Throwable th3) {
                        this.f4565g = null;
                        if (this.f4568j) {
                            this.f4568j = false;
                            t();
                        }
                        throw th3;
                    }
                } catch (IOException e11) {
                    throw new zzkl(e11, 2000);
                }
            }
        } catch (IOException e12) {
            throw new zzkl(e12, 2000);
        }
    }

    @Override // ai.a8
    public final Uri h() {
        return this.f4564f;
    }

    @Override // ai.a8
    public final long m(bc bcVar) throws zzkl {
        int i10;
        AssetFileDescriptor openAssetFileDescriptor;
        long j10;
        try {
            try {
                Uri uri = bcVar.f2279a;
                this.f4564f = uri;
                q(bcVar);
                if ("content".equals(bcVar.f2279a.getScheme())) {
                    Bundle bundle = new Bundle();
                    if (sb.f9778a >= 31) {
                        fs3.a(bundle);
                    }
                    openAssetFileDescriptor = this.f4563e.openTypedAssetFileDescriptor(uri, "*/*", bundle);
                } else {
                    openAssetFileDescriptor = this.f4563e.openAssetFileDescriptor(uri, TopicConstant.EXTEND_AAC_RAW);
                }
                this.f4565g = openAssetFileDescriptor;
                if (openAssetFileDescriptor != null) {
                    long length = openAssetFileDescriptor.getLength();
                    FileInputStream fileInputStream = new FileInputStream(openAssetFileDescriptor.getFileDescriptor());
                    this.f4566h = fileInputStream;
                    int i11 = (length > (-1L) ? 1 : (length == (-1L) ? 0 : -1));
                    if (i11 != 0 && bcVar.f2284f > length) {
                        throw new zzkl(null, 2008);
                    }
                    long startOffset = openAssetFileDescriptor.getStartOffset();
                    long skip = fileInputStream.skip(bcVar.f2284f + startOffset) - startOffset;
                    if (skip == bcVar.f2284f) {
                        if (i11 == 0) {
                            FileChannel channel = fileInputStream.getChannel();
                            long size = channel.size();
                            if (size == 0) {
                                this.f4567i = -1L;
                                j10 = -1;
                            } else {
                                j10 = size - channel.position();
                                this.f4567i = j10;
                                if (j10 < 0) {
                                    throw new zzkl(null, 2008);
                                }
                            }
                        } else {
                            j10 = length - skip;
                            this.f4567i = j10;
                            if (j10 < 0) {
                                throw new zzkl(null, 2008);
                            }
                        }
                        long j11 = bcVar.f2285g;
                        if (j11 != -1) {
                            if (j10 != -1) {
                                j11 = Math.min(j10, j11);
                            }
                            this.f4567i = j11;
                        }
                        this.f4568j = true;
                        r(bcVar);
                        long j12 = bcVar.f2285g;
                        return j12 != -1 ? j12 : this.f4567i;
                    }
                    throw new zzkl(null, 2008);
                }
                String valueOf = String.valueOf(uri);
                StringBuilder sb2 = new StringBuilder(valueOf.length() + 36);
                sb2.append("Could not open file descriptor for: ");
                sb2.append(valueOf);
                i10 = 2000;
                try {
                    throw new zzkl(new IOException(sb2.toString()), 2000);
                } catch (IOException e10) {
                    e = e10;
                    if (true == (e instanceof FileNotFoundException)) {
                        i10 = 2005;
                    }
                    throw new zzkl(e, i10);
                }
            } catch (zzkl e11) {
                throw e11;
            }
        } catch (IOException e12) {
            e = e12;
            i10 = 2000;
        }
    }
}
