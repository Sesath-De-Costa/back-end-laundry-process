package lk.washhub.washapp.web.dao;

import lk.washhub.washapp.web.entity.Request;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Sesath De Costa on 2021-03-01
 * <p>
 * This file is subject to the terms and conditions defined in
 * file 'LICENSE.txt', which is part of this source code package.
 **/
public interface RequestDAO extends JpaRepository<Request, Integer> {
}
