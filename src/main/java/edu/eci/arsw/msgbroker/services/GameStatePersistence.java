/*
 * Copyright (C) 2016 Pivotal Software, Inc.
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package edu.eci.arsw.msgbroker.services;

import edu.eci.arsw.msgbroker.model.HangmanGame;

/**
 *
 * @author hcadavid
 */
public interface GameStatePersistence {

    public void createGame(int id,String word) throws GameCreationException;
    
    public HangmanGame getGame(int gameid) throws GameNotFoundException;
    
}
