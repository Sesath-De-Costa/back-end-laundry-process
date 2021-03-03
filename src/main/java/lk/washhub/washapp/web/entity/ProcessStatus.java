package lk.washhub.washapp.web.entity;

import javax.persistence.Embeddable;

/**
 * Created by Sesath De Costa on 2021-02-25
 * <p>
 * This file is subject to the terms and conditions defined in
 * file 'LICENSE.txt', which is part of this source code package.
 **/
@Embeddable
public enum ProcessStatus {
    NOT_STARTED, STARTED, COMPLETED
}
