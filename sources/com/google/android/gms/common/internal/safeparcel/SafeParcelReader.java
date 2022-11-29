package com.google.android.gms.common.internal.safeparcel;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* loaded from: classes3.dex */
public class SafeParcelReader {

    /* loaded from: classes3.dex */
    public static class ParseException extends RuntimeException {
        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public ParseException(java.lang.String r4, android.os.Parcel r5) {
            /*
                r3 = this;
                int r0 = r5.dataPosition()
                int r5 = r5.dataSize()
                java.lang.String r1 = java.lang.String.valueOf(r4)
                int r1 = r1.length()
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                int r1 = r1 + 41
                r2.<init>(r1)
                r2.append(r4)
                java.lang.String r4 = " Parcel: pos="
                r2.append(r4)
                r2.append(r0)
                java.lang.String r4 = " size="
                r2.append(r4)
                r2.append(r5)
                java.lang.String r4 = r2.toString()
                r3.<init>(r4)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ParseException.<init>(java.lang.String, android.os.Parcel):void");
        }
    }

    public static void A(Parcel parcel, int i10, int i11) {
        int w10 = w(parcel, i10);
        if (w10 == i11) {
            return;
        }
        String hexString = Integer.toHexString(w10);
        StringBuilder sb2 = new StringBuilder(String.valueOf(hexString).length() + 46);
        sb2.append("Expected size ");
        sb2.append(i11);
        sb2.append(" got ");
        sb2.append(w10);
        sb2.append(" (0x");
        sb2.append(hexString);
        sb2.append(")");
        throw new ParseException(sb2.toString(), parcel);
    }

    public static Bundle a(Parcel parcel, int i10) {
        int w10 = w(parcel, i10);
        int dataPosition = parcel.dataPosition();
        if (w10 == 0) {
            return null;
        }
        Bundle readBundle = parcel.readBundle();
        parcel.setDataPosition(dataPosition + w10);
        return readBundle;
    }

    public static byte[] b(Parcel parcel, int i10) {
        int w10 = w(parcel, i10);
        int dataPosition = parcel.dataPosition();
        if (w10 == 0) {
            return null;
        }
        byte[] createByteArray = parcel.createByteArray();
        parcel.setDataPosition(dataPosition + w10);
        return createByteArray;
    }

    public static int[] c(Parcel parcel, int i10) {
        int w10 = w(parcel, i10);
        int dataPosition = parcel.dataPosition();
        if (w10 == 0) {
            return null;
        }
        int[] createIntArray = parcel.createIntArray();
        parcel.setDataPosition(dataPosition + w10);
        return createIntArray;
    }

    public static ArrayList<Integer> d(Parcel parcel, int i10) {
        int w10 = w(parcel, i10);
        int dataPosition = parcel.dataPosition();
        if (w10 == 0) {
            return null;
        }
        ArrayList<Integer> arrayList = new ArrayList<>();
        int readInt = parcel.readInt();
        for (int i11 = 0; i11 < readInt; i11++) {
            arrayList.add(Integer.valueOf(parcel.readInt()));
        }
        parcel.setDataPosition(dataPosition + w10);
        return arrayList;
    }

    public static <T extends Parcelable> T e(Parcel parcel, int i10, Parcelable.Creator<T> creator) {
        int w10 = w(parcel, i10);
        int dataPosition = parcel.dataPosition();
        if (w10 == 0) {
            return null;
        }
        T createFromParcel = creator.createFromParcel(parcel);
        parcel.setDataPosition(dataPosition + w10);
        return createFromParcel;
    }

    public static String f(Parcel parcel, int i10) {
        int w10 = w(parcel, i10);
        int dataPosition = parcel.dataPosition();
        if (w10 == 0) {
            return null;
        }
        String readString = parcel.readString();
        parcel.setDataPosition(dataPosition + w10);
        return readString;
    }

    public static String[] g(Parcel parcel, int i10) {
        int w10 = w(parcel, i10);
        int dataPosition = parcel.dataPosition();
        if (w10 == 0) {
            return null;
        }
        String[] createStringArray = parcel.createStringArray();
        parcel.setDataPosition(dataPosition + w10);
        return createStringArray;
    }

    public static ArrayList<String> h(Parcel parcel, int i10) {
        int w10 = w(parcel, i10);
        int dataPosition = parcel.dataPosition();
        if (w10 == 0) {
            return null;
        }
        ArrayList<String> createStringArrayList = parcel.createStringArrayList();
        parcel.setDataPosition(dataPosition + w10);
        return createStringArrayList;
    }

    public static <T> T[] i(Parcel parcel, int i10, Parcelable.Creator<T> creator) {
        int w10 = w(parcel, i10);
        int dataPosition = parcel.dataPosition();
        if (w10 == 0) {
            return null;
        }
        T[] tArr = (T[]) parcel.createTypedArray(creator);
        parcel.setDataPosition(dataPosition + w10);
        return tArr;
    }

    public static <T> ArrayList<T> j(Parcel parcel, int i10, Parcelable.Creator<T> creator) {
        int w10 = w(parcel, i10);
        int dataPosition = parcel.dataPosition();
        if (w10 == 0) {
            return null;
        }
        ArrayList<T> createTypedArrayList = parcel.createTypedArrayList(creator);
        parcel.setDataPosition(dataPosition + w10);
        return createTypedArrayList;
    }

    public static void k(Parcel parcel, int i10) {
        if (parcel.dataPosition() == i10) {
            return;
        }
        StringBuilder sb2 = new StringBuilder(37);
        sb2.append("Overread allowed size end=");
        sb2.append(i10);
        throw new ParseException(sb2.toString(), parcel);
    }

    public static int l(int i10) {
        return (char) i10;
    }

    public static boolean m(Parcel parcel, int i10) {
        A(parcel, i10, 4);
        return parcel.readInt() != 0;
    }

    public static Boolean n(Parcel parcel, int i10) {
        int w10 = w(parcel, i10);
        if (w10 == 0) {
            return null;
        }
        z(parcel, i10, w10, 4);
        return Boolean.valueOf(parcel.readInt() != 0);
    }

    public static Double o(Parcel parcel, int i10) {
        int w10 = w(parcel, i10);
        if (w10 == 0) {
            return null;
        }
        z(parcel, i10, w10, 8);
        return Double.valueOf(parcel.readDouble());
    }

    public static float p(Parcel parcel, int i10) {
        A(parcel, i10, 4);
        return parcel.readFloat();
    }

    public static Float q(Parcel parcel, int i10) {
        int w10 = w(parcel, i10);
        if (w10 == 0) {
            return null;
        }
        z(parcel, i10, w10, 4);
        return Float.valueOf(parcel.readFloat());
    }

    public static int r(Parcel parcel) {
        return parcel.readInt();
    }

    public static IBinder s(Parcel parcel, int i10) {
        int w10 = w(parcel, i10);
        int dataPosition = parcel.dataPosition();
        if (w10 == 0) {
            return null;
        }
        IBinder readStrongBinder = parcel.readStrongBinder();
        parcel.setDataPosition(dataPosition + w10);
        return readStrongBinder;
    }

    public static int t(Parcel parcel, int i10) {
        A(parcel, i10, 4);
        return parcel.readInt();
    }

    public static long u(Parcel parcel, int i10) {
        A(parcel, i10, 8);
        return parcel.readLong();
    }

    public static Long v(Parcel parcel, int i10) {
        int w10 = w(parcel, i10);
        if (w10 == 0) {
            return null;
        }
        z(parcel, i10, w10, 8);
        return Long.valueOf(parcel.readLong());
    }

    public static int w(Parcel parcel, int i10) {
        return (i10 & (-65536)) != -65536 ? (char) (i10 >> 16) : parcel.readInt();
    }

    public static void x(Parcel parcel, int i10) {
        parcel.setDataPosition(parcel.dataPosition() + w(parcel, i10));
    }

    public static int y(Parcel parcel) {
        int r10 = r(parcel);
        int w10 = w(parcel, r10);
        int dataPosition = parcel.dataPosition();
        if (l(r10) != 20293) {
            String valueOf = String.valueOf(Integer.toHexString(r10));
            throw new ParseException(valueOf.length() != 0 ? "Expected object header. Got 0x".concat(valueOf) : new String("Expected object header. Got 0x"), parcel);
        }
        int i10 = w10 + dataPosition;
        if (i10 < dataPosition || i10 > parcel.dataSize()) {
            StringBuilder sb2 = new StringBuilder(54);
            sb2.append("Size read is invalid start=");
            sb2.append(dataPosition);
            sb2.append(" end=");
            sb2.append(i10);
            throw new ParseException(sb2.toString(), parcel);
        }
        return i10;
    }

    public static void z(Parcel parcel, int i10, int i11, int i12) {
        if (i11 == i12) {
            return;
        }
        String hexString = Integer.toHexString(i11);
        StringBuilder sb2 = new StringBuilder(String.valueOf(hexString).length() + 46);
        sb2.append("Expected size ");
        sb2.append(i12);
        sb2.append(" got ");
        sb2.append(i11);
        sb2.append(" (0x");
        sb2.append(hexString);
        sb2.append(")");
        throw new ParseException(sb2.toString(), parcel);
    }
}
