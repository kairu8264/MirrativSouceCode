package ke;

import android.os.Parcel;
import android.os.Parcelable;
import com.dena.mirrorman.clientlog.logs.ShopSelectItemLog;
import com.dena.mirrorman.net.api.request.PurchaseAvatarsRequest;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import jf.k0;
import jo.p;
import ud.q;
import xn.a0;

/* loaded from: classes2.dex */
public final class a implements Parcelable {
    public static final Parcelable.Creator<a> CREATOR = new C0545a();

    /* renamed from: x  reason: collision with root package name */
    public static final int f38714x = 8;

    /* renamed from: w  reason: collision with root package name */
    public final List<q> f38715w;

    /* renamed from: ke.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0545a implements Parcelable.Creator<a> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public final a createFromParcel(Parcel parcel) {
            p.h(parcel, "parcel");
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            for (int i10 = 0; i10 != readInt; i10++) {
                arrayList.add(q.CREATOR.createFromParcel(parcel));
            }
            return new a(arrayList);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public final a[] newArray(int i10) {
            return new a[i10];
        }
    }

    public a(List<q> list) {
        p.h(list, "parts");
        this.f38715w = list;
    }

    public final ShopSelectItemLog a() {
        return new ShopSelectItemLog(c(this.f38715w, k0.PERSONA), c(this.f38715w, k0.PROPOTION), c(this.f38715w, k0.HEAD), c(this.f38715w, k0.HAIR), c(this.f38715w, k0.EYEBROW), c(this.f38715w, k0.EYE), c(this.f38715w, k0.EYESHADOW), c(this.f38715w, k0.CHEEK), c(this.f38715w, k0.NOSE), c(this.f38715w, k0.BEARD), c(this.f38715w, k0.MOUTH), c(this.f38715w, k0.LIP), c(this.f38715w, k0.FACE_PAINT), c(this.f38715w, k0.SETUP_CLOTHES), c(this.f38715w, k0.ONEPIECE), c(this.f38715w, k0.TOPS), c(this.f38715w, k0.BOTTOMS), c(this.f38715w, k0.SOCKS), c(this.f38715w, k0.SHOES), c(this.f38715w, k0.HAT), c(this.f38715w, k0.GLASSES), c(this.f38715w, k0.SCARF), c(this.f38715w, k0.PET), c(this.f38715w, k0.WEAPON), c(this.f38715w, k0.WING), c(this.f38715w, k0.BACKGROUND), c(this.f38715w, k0.MOTION_UP), c(this.f38715w, k0.MOTION_LEFT), c(this.f38715w, k0.MOTION_RIGHT), c(this.f38715w, k0.MOTION_DOWN), c(this.f38715w, k0.BACK_WING), c(this.f38715w, k0.EFFECT), c(this.f38715w, k0.LEFT_INTERIOR), c(this.f38715w, k0.CENTER_INTERIOR), c(this.f38715w, k0.RIGHT_INTERIOR), c(this.f38715w, k0.MACHINE), c(this.f38715w, k0.HAT_V2), c(this.f38715w, k0.HAIR_ORNAMENT), c(this.f38715w, k0.HEAD_BAND), c(this.f38715w, k0.GLASSES_V2), c(this.f38715w, k0.MASK), c(this.f38715w, k0.EARRING), c(this.f38715w, k0.LEFT_WEAPON), c(this.f38715w, k0.RIGHT_WEAPON), c(this.f38715w, k0.BOTH_WEAPON), c(this.f38715w, k0.KEMOMIMI), c(this.f38715w, k0.NECKLACE));
    }

    public final PurchaseAvatarsRequest b() {
        ArrayList arrayList = new ArrayList();
        for (q qVar : this.f38715w) {
            if (qVar.x() && qVar.q()) {
                arrayList.add(Integer.valueOf(Integer.parseInt(qVar.j())));
            }
        }
        return new PurchaseAvatarsRequest(a0.B0(arrayList));
    }

    public final String c(List<q> list, k0 k0Var) {
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (((q) next).l() == k0Var) {
                arrayList.add(next);
            }
        }
        if (!arrayList.isEmpty()) {
            q qVar = (q) a0.X(arrayList);
            if (qVar.x()) {
                return qVar.j();
            }
            return null;
        }
        return null;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        p.h(parcel, "out");
        List<q> list = this.f38715w;
        parcel.writeInt(list.size());
        for (q qVar : list) {
            qVar.writeToParcel(parcel, i10);
        }
    }
}
