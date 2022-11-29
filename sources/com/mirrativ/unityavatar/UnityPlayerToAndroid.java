package com.mirrativ.unityavatar;

/* loaded from: classes4.dex */
public class UnityPlayerToAndroid {
    public static ICallback receiver;
    public static ICallback receiverV2;
    public static ICallback verbose;

    /* loaded from: classes4.dex */
    public interface ICallback {
        void receiveMessage(String str);
    }

    public void sendMessage(String str) {
        ICallback iCallback = receiver;
        if (iCallback != null) {
            iCallback.receiveMessage(str);
        }
    }

    public void sendMessageV2(String str) {
        ICallback iCallback = receiverV2;
        if (iCallback != null) {
            iCallback.receiveMessage(str);
        }
    }

    public void sendVerbose(String str) {
        ICallback iCallback = verbose;
        if (iCallback != null) {
            iCallback.receiveMessage(str);
        }
    }
}
