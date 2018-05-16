/*
 * Copyright 2017 jiajunhui<junhui_jia@163.com>
 *
 *    Licensed under the Apache License, Version 2.0 (the "License");
 *    you may not use this file except in compliance with the License.
 *    You may obtain a copy of the License at
 *
 *        http://www.apache.org/licenses/LICENSE-2.0
 *
 *    Unless required by applicable law or agreed to in writing, software
 *    distributed under the License is distributed on an "AS IS" BASIS,
 *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *    See the License for the specific language governing permissions and
 *    limitations under the License.
 */

package com.kk.taurus.playerbase.receiver;

import android.os.Bundle;

/**
 * Created by Taurus on 2018/3/17.
 */

public interface IReceiver {

    /**
     * bind group value.
     * @param groupValue
     */
    void bindGroupValue(GroupValue groupValue);

    /**
     * on receiver added to ReceiverGroup.
     */
    void onReceiverBind();

    /**
     * all player event dispatch by this method.
     * @param eventCode
     * @param bundle
     */
    void onPlayerEvent(int eventCode, Bundle bundle);

    /**
     * error event.
     * @param eventCode
     * @param bundle
     */
    void onErrorEvent(int eventCode, Bundle bundle);

    /**
     * bind the bridge of receivers communication
     * @param onReceiverEventListener
     */
    void bindReceiverEventListener(OnReceiverEventListener onReceiverEventListener);

    /**
     * receivers event.
     * @param eventCode
     * @param bundle
     */
    void onReceiverEvent(int eventCode, Bundle bundle);

    /**
     * if you have a receiver instance reference,
     * you can call this method dispatch private event.
     * @param eventCode
     * @param bundle
     */
    void onPrivateEvent(int eventCode, Bundle bundle);

    /**
     * on receiver destroy.
     * when receiver removed, this method will be callback.
     */
    void onReceiverUnBind();

}
