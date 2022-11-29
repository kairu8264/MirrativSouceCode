package ai;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/* loaded from: classes3.dex */
public final class ge0 extends sh.a {
    public static final Parcelable.Creator<ge0> CREATOR = new he0();

    /* renamed from: w  reason: collision with root package name */
    public ParcelFileDescriptor f4399w;

    /* renamed from: x  reason: collision with root package name */
    public Parcelable f4400x = null;

    /* renamed from: y  reason: collision with root package name */
    public boolean f4401y = true;

    public ge0(ParcelFileDescriptor parcelFileDescriptor) {
        this.f4399w = parcelFileDescriptor;
    }

    public final <T extends sh.c> T p(Parcelable.Creator<T> creator) {
        if (this.f4401y) {
            ParcelFileDescriptor parcelFileDescriptor = this.f4399w;
            if (parcelFileDescriptor == null) {
                uj0.c("File descriptor is empty, returning null.");
                return null;
            }
            DataInputStream dataInputStream = new DataInputStream(new ParcelFileDescriptor.AutoCloseInputStream(parcelFileDescriptor));
            try {
                try {
                    int readInt = dataInputStream.readInt();
                    byte[] bArr = new byte[readInt];
                    dataInputStream.readFully(bArr, 0, readInt);
                    vh.l.a(dataInputStream);
                    Parcel obtain = Parcel.obtain();
                    try {
                        obtain.unmarshall(bArr, 0, readInt);
                        obtain.setDataPosition(0);
                        this.f4400x = creator.createFromParcel(obtain);
                        obtain.recycle();
                        this.f4401y = false;
                    } catch (Throwable th2) {
                        obtain.recycle();
                        throw th2;
                    }
                } catch (IOException e10) {
                    uj0.d("Could not read from parcel file descriptor", e10);
                    vh.l.a(dataInputStream);
                    return null;
                }
            } catch (Throwable th3) {
                vh.l.a(dataInputStream);
                throw th3;
            }
        }
        return (T) this.f4400x;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        final ParcelFileDescriptor.AutoCloseOutputStream autoCloseOutputStream;
        if (this.f4399w == null) {
            Parcel obtain = Parcel.obtain();
            try {
                this.f4400x.writeToParcel(obtain, 0);
                final byte[] marshall = obtain.marshall();
                obtain.recycle();
                ParcelFileDescriptor parcelFileDescriptor = null;
                try {
                    ParcelFileDescriptor[] createPipe = ParcelFileDescriptor.createPipe();
                    autoCloseOutputStream = new ParcelFileDescriptor.AutoCloseOutputStream(createPipe[1]);
                    try {
                        hk0.f4878a.execute(new Runnable(autoCloseOutputStream, marshall) { // from class: ai.fe0

                            /* renamed from: w  reason: collision with root package name */
                            public final OutputStream f3996w;

                            /* renamed from: x  reason: collision with root package name */
                            public final byte[] f3997x;

                            {
                                this.f3996w = autoCloseOutputStream;
                                this.f3997x = marshall;
                            }

                            @Override // java.lang.Runnable
                            public final void run() {
                                OutputStream outputStream = this.f3996w;
                                byte[] bArr = this.f3997x;
                                Parcelable.Creator<ge0> creator = ge0.CREATOR;
                                DataOutputStream dataOutputStream = null;
                                try {
                                    try {
                                        DataOutputStream dataOutputStream2 = new DataOutputStream(outputStream);
                                        try {
                                            dataOutputStream2.writeInt(bArr.length);
                                            dataOutputStream2.write(bArr);
                                            vh.l.a(dataOutputStream2);
                                        } catch (IOException e10) {
                                            e = e10;
                                            dataOutputStream = dataOutputStream2;
                                            uj0.d("Error transporting the ad response", e);
                                            wg.t.h().k(e, "LargeParcelTeleporter.pipeData.1");
                                            if (dataOutputStream == null) {
                                                vh.l.a(outputStream);
                                            } else {
                                                vh.l.a(dataOutputStream);
                                            }
                                        } catch (Throwable th2) {
                                            th = th2;
                                            dataOutputStream = dataOutputStream2;
                                            if (dataOutputStream == null) {
                                                vh.l.a(outputStream);
                                            } else {
                                                vh.l.a(dataOutputStream);
                                            }
                                            throw th;
                                        }
                                    } catch (Throwable th3) {
                                        th = th3;
                                    }
                                } catch (IOException e11) {
                                    e = e11;
                                }
                            }
                        });
                        parcelFileDescriptor = createPipe[0];
                    } catch (IOException e10) {
                        e = e10;
                        uj0.d("Error transporting the ad response", e);
                        wg.t.h().k(e, "LargeParcelTeleporter.pipeData.2");
                        vh.l.a(autoCloseOutputStream);
                        this.f4399w = parcelFileDescriptor;
                        int a10 = sh.b.a(parcel);
                        sh.b.p(parcel, 2, this.f4399w, i10, false);
                        sh.b.b(parcel, a10);
                    }
                } catch (IOException e11) {
                    e = e11;
                    autoCloseOutputStream = null;
                }
                this.f4399w = parcelFileDescriptor;
            } catch (Throwable th2) {
                obtain.recycle();
                throw th2;
            }
        }
        int a102 = sh.b.a(parcel);
        sh.b.p(parcel, 2, this.f4399w, i10, false);
        sh.b.b(parcel, a102);
    }
}
