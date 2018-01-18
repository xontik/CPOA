<?php
/* Module de PHP
 * Paramètres de configuration du site
 *
 * Copyright 2017, Eric Dufour
 * http://techfacile.fr
 *
 * Licensed under the MIT license:
 * http://www.opensource.org/licenses/MIT
 */
ini_set('display_errors', 1);
ini_set('display_startup_errors', 1);
error_reporting(E_ALL);

const DEBUG = true; // production : false; dev : true

// Accès base de données
const BD_HOST = 'iutdoua-web.univ-lyon1.fr';
const BD_DBNAME = 'p1502484';
const BD_USER = 'p1502484';
const BD_PWD = '240617';

const LOGIN = "admin";
const PASSWORD = "8c6976e5b5410415bde908bd4dee15dfb167a9c873fc4bb8a81f6f2ab448a918";


//dossiers racines du site
define('PATH_CONTROLLERS','./controllers/c_');
define('PATH_ENTITY','./entities/');
define('PATH_ASSETS','./assets/');
define('PATH_LIB','./lib/');
define('PATH_MODELS','./models/');
define('PATH_VIEWS','./views/v_');



define('PATH_CSS', PATH_ASSETS.'css/');
define('PATH_IMAGES', PATH_ASSETS.'images/');
define('PATH_SCRIPTS', PATH_ASSETS.'js/');
