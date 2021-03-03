package lk.washhub.washapp.web.entity;

import javax.persistence.Embeddable;
import javax.persistence.Enumerated;

/**
 * Created by Sesath De Costa on 2021-02-24
 * <p>
 * This file is subject to the terms and conditions defined in
 * file 'LICENSE.txt', which is part of this source code package.
 **/
@Embeddable
public enum StageTypes {
    REQUESTED, CANCELED, PICKED, RECEIVED, WASHED, DRIED, IRONED, READY, ON_THE_WAY, COMPLETED
}
