package com.zecovery.android.dev.localidad.db;

/**
 * Created by moe on 17-11-16.
 */

public final class LocalidadContract {

    public static class DbConstants{

        public static final int DATABASE_VERSION = 2;
        public static final String DATABASE_NAME = " Localidad.db" ;

        public static final String CREATE_TABLE = " CREATE TABLE" ;
        public static final String DROP_TABLE = " DROP TABLE IF EXISTS " ;
        public static final String INSERT_INTO = " INSERT INTO" ;
        public static final String SELECT_ALL_FROM = " SELECT * FROM" ;

        public static final String TEXT_TYPE ="  TEXT" ;
        public static final String INT_TYPE ="  INTEGER" ;
        public static final String INTEGER_PRIMARY_KEY ="  INTEGER PRIMARY KEY" ;
        public static final String COMA =" , " ;

        public static final String TABLE_NAME_COMUNA=" comuna" ;
        public static final String TABLE_NAME_PROVINCIA=" provincia" ;
        public static final String TABLE_NAME_REGION=" region" ;

        public static final String COLUMN_COMUNA_ID=" comu_id" ;
        public static final String COLUMN_COMUNA_NOMBRE=" comu_nombre" ;

        public static final String COLUMN_PROVINCIA_ID=" prov_id" ;
        public static final String COLUMN_PROVINCIA_NOMBRE=" prov_nombre" ;

        public static final String COLUMN_REGION_ID=" regi_id" ;
        public static final String COLUMN_REGION_NOMBRE=" regi_nombre" ;
        public static final String COLUMN_REGION_ROMANO=" regi_romano" ;
    }

    private LocalidadContract() {
    }

    public static final String SQL_CREATE_TABLE_COMUNA =
            DbConstants.CREATE_TABLE + DbConstants.TABLE_NAME_COMUNA + "  ("  +
                    DbConstants.COLUMN_COMUNA_ID + DbConstants.INTEGER_PRIMARY_KEY + DbConstants.COMA +
                    DbConstants.COLUMN_COMUNA_NOMBRE + DbConstants.TEXT_TYPE + DbConstants.COMA +
                    DbConstants.COLUMN_PROVINCIA_ID + DbConstants.INT_TYPE + DbConstants.COMA +
                    DbConstants.COLUMN_REGION_ID + DbConstants.TEXT_TYPE + "  )" ;

    public static final String SQL_CREATE_TABLE_PROVINCIA =
            DbConstants.CREATE_TABLE + DbConstants.TABLE_NAME_PROVINCIA + "  ("  +
                    DbConstants.COLUMN_PROVINCIA_ID + DbConstants.INTEGER_PRIMARY_KEY + DbConstants.COMA +
                    DbConstants.COLUMN_PROVINCIA_NOMBRE + DbConstants.TEXT_TYPE + DbConstants.COMA +
                    DbConstants.COLUMN_REGION_ID + DbConstants.TEXT_TYPE + "  )" ;

    public static final String SQL_CREATE_TABLE_REGION =
            DbConstants.CREATE_TABLE + DbConstants.TABLE_NAME_REGION + "  ("  +
                    DbConstants.COLUMN_REGION_ID + DbConstants.INTEGER_PRIMARY_KEY + DbConstants.COMA +
                    DbConstants.COLUMN_REGION_NOMBRE + DbConstants.TEXT_TYPE + DbConstants.COMA +
                    DbConstants.COLUMN_REGION_ROMANO + DbConstants.TEXT_TYPE +"  )" ;

    public static final String SQL_DROP_TABLE_COMUNA = DbConstants.DROP_TABLE + DbConstants.TABLE_NAME_COMUNA;
    public static final String SQL_DROP_TABLE_PROVINCIA = DbConstants.DROP_TABLE + DbConstants.TABLE_NAME_PROVINCIA;
    public static final String SQL_DROP_TABLE_REGION = DbConstants.DROP_TABLE + DbConstants.TABLE_NAME_REGION;

    public static final String SQL_INSERT_REGION =
            DbConstants.INSERT_INTO + DbConstants.TABLE_NAME_REGION + "  VALUES" +
                    " (1,'Arica y Parinacota','XV'), "  +
                    " (2,'Tarapacá','I'), "  +
                    " (3,'Antofagasta','II'), "  +
                    " (4,'Atacama','III'), "  +
                    " (5,'Coquimbo','IV'), "  +
                    " (6,'Valparaiso','V'), "  +
                    " (7,'Metropolitana de Santiago','RM'), "  +
                    " (8,'Libertador General Bernardo OHiggins','VI'), "  +
                    " (9,'Maule','VII'), "  +
                    " (10,'Biobío','VIII'), "  +
                    " (11,'La Araucanía','IX'), "  +
                    " (12,'Los Ríos','XIV'), "  +
                    " (13,'Los Lagos','X'), "  +
                    " (14,'Aisén del General Carlos Ibáñez del Campo','XI'), "  +
                    " (15,'Magallanes y de la Antártica Chilena','XII');" ;


    public static final String SQL_INSERT_PROVINCIA =
            DbConstants.INSERT_INTO + DbConstants.TABLE_NAME_PROVINCIA + "   VALUES" +
                    " (1,'Arica',1),"  +
                    " (2,'Parinacota',1),"  +
                    " (3,'Iquique',2),"  +
                    " (4,'El Tamarugal',2),"  +
                    " (5,'Antofagasta',3),"  +
                    " (6,'El Loa',3),"  +
                    " (7,'Tocopilla',3),"  +
                    " (8,'Chañaral',4),"  +
                    " (9,'Copiapó',4),"  +
                    " (10,'Huasco',4),"  +
                    " (11,'Choapa',5),"  +
                    " (12,'Elqui',5),"  +
                    " (13,'Limarí',5),"  +
                    " (14,'Isla de Pascua',6),"  +
                    " (15,'Los Andes',6),"  +
                    " (16,'Petorca',6),"  +
                    " (17,'Quillota',6),"  +
                    " (18,'San Antonio',6),"  +
                    " (19,'San Felipe de Aconcagua',6),"  +
                    " (20,'Valparaiso',6),"  +
                    " (21,'Chacabuco',7),"  +
                    " (22,'Cordillera',7),"  +
                    " (23,'Maipo',7),"  +
                    " (24,'Melipilla',7),"  +
                    " (25,'Santiago',7),"  +
                    " (26,'Talagante',7),"  +
                    " (27,'Cachapoal',8),"  +
                    " (28,'Cardenal Caro',8),"  +
                    " (29,'Colchagua',8),"  +
                    " (30,'Cauquenes',9),"  +
                    " (31,'Curicó',9),"  +
                    " (32,'Linares',9),"  +
                    " (33,'Talca',9),"  +
                    " (34,'Arauco',10),"  +
                    " (35,'Bio Bío',10),"  +
                    " (36,'Concepción',10),"  +
                    " (37,'Ñuble',10),"  +
                    " (38,'Cautín',11),"  +
                    " (39,'Malleco',11),"  +
                    " (40,'Valdivia',12),"  +
                    " (41,'Ranco',12),"  +
                    " (42,'Chiloé',13),"  +
                    " (43,'Llanquihue',13),"  +
                    " (44,'Osorno',13),"  +
                    " (45,'Palena',13),"  +
                    " (46,'Aisén',14),"  +
                    " (47,'Capitán Prat',14),"  +
                    " (48,'Coihaique',14),"  +
                    " (49,'General Carrera',14),"  +
                    " (50,'Antártica Chilena',15),"  +
                    " (51,'Magallanes',15),"  +
                    " (52,'Tierra del Fuego',15),"  +
                    " (53,'Última Esperanza',15);" ;

    public static final String SQL_INSERT_COMUNA =


            DbConstants.INSERT_INTO + DbConstants.TABLE_NAME_COMUNA + " VALUES" +
                    " ('1101', 'Iquique', '11', '1'), " +
                    " ('1107', 'Alto Hospicio', '11', '1'), "+
                    " ('1401', 'Pozo Almonte', '14', '1'), "+
                    " ('1402', 'Camiña', '14', '1'), "+
                    " ('1403', 'Colchane', '14', '1'), "+
                    " ('1404', 'Huara', '14', '1'), "+
                    " ('1405', 'Pica', '14', '1'), "+
                    " ('2101', 'Antofagasta', '21', '2'), "+
                    " ('2102', 'Mejillones', '21', '2'), "+
                    " ('2103', 'Sierra Gorda', '21', '2'), "+
                    " ('2104', 'Taltal', '21', '2'), "+
                    " ('2201', 'Calama', '22', '2'), "+
                    " ('2202', 'Ollagüe', '22', '2'), "+
                    " ('2203', 'San Pedro de Atacama', '22', '2'), "+
                    " ('2301', 'Tocopilla', '23', '2'), "+
                    " ('2302', 'Maria Elena', '23', '2'), "+
                    " ('3101', 'Copiapó', '31', '3'), "+
                    " ('3102', 'Caldera', '31', '3'), "+
                    " ('3103', 'Tierra Amarilla', '31', '3'), "+
                    " ('3201', 'Chañaral', '32', '3'), "+
                    " ('3202', 'Diego de Almagro', '32', '3'), "+
                    " ('3301', 'Vallenar', '33', '3'), "+
                    " ('3302', 'Alto del Carmen', '33', '3'), "+
                    " ('3303', 'Freirina', '33', '3'), "+
                    " ('3304', 'Huasco', '33', '3'), "+
                    " ('4101', 'La Serena', '41', '4'), "+
                    " ('4102', 'Coquimbo', '41', '4'), "+
                    " ('4103', 'Andacollo', '41', '4'), "+
                    " ('4104', 'La Higuera', '41', '4'), "+
                    " ('4105', 'Paiguano', '41', '4'), "+
                    " ('4106', 'Vicuña', '41', '4'), "+
                    " ('4201', 'Illapel', '42', '4'), "+
                    " ('4202', 'Canela', '42', '4'), "+
                    " ('4203', 'Los Vilos', '42', '4'), "+
                    " ('4204', 'Salamanca', '42', '4'), "+
                    " ('4301', 'Ovalle', '43', '4'), "+
                    " ('4302', 'Combarbalá', '43', '4'), "+
                    " ('4303', 'Monte Patria', '43', '4'), "+
                    " ('4304', 'Punitaqui', '43', '4'), "+
                    " ('4305', 'Rio Hurtado', '43', '4'), "+
                    " ('5101', 'Valparaíso', '51', '5'), "+
                    " ('5102', 'Casablanca', '51', '5'), "+
                    " ('5103', 'Concón', '51', '5'), "+
                    " ('5104', 'Juan Fernández', '51', '5'), "+
                    " ('5105', 'Puchuncavi', '51', '5'), "+
                    " ('5107', 'Quintero', '51', '5'), "+
                    " ('5109', 'Viña del Mar', '51', '5'), "+
                    " ('5201', 'Isla de Pascua', '52', '5'), "+
                    " ('5301', 'Los Andes', '53', '5'), "+
                    " ('5302', 'Calle Larga', '53', '5'), "+
                    " ('5303', 'Rinconada', '53', '5'), "+
                    " ('5304', 'San Esteban', '53', '5'), "+
                    " ('5401', 'La Ligua', '54', '5'), "+
                    " ('5402', 'Cabildo', '54', '5'), "+
                    " ('5403', 'Papudo', '54', '5'), "+
                    " ('5404', 'Petorca', '54', '5'), "+
                    " ('5405', 'Zapallar', '54', '5'), "+
                    " ('5501', 'Quillota', '55', '5'), "+
                    " ('5502', 'Calera', '55', '5'), "+
                    " ('5503', 'Hijuelas', '55', '5'), "+
                    " ('5504', 'La Cruz', '55', '5'), "+
                    " ('5506', 'Nogales', '55', '5'), "+
                    " ('5601', 'San Antonio', '56', '5'), "+
                    " ('5602', 'Algarrobo', '56', '5'), "+
                    " ('5603', 'Cartagena', '56', '5'), "+
                    " ('5604', 'El Quisco', '56', '5'), "+
                    " ('5605', 'El Tabo', '56', '5'), "+
                    " ('5606', 'Santo Domingo', '56', '5'), "+
                    " ('5701', 'San Felipe', '57', '5'), "+
                    " ('5702', 'Catemu', '57', '5'), "+
                    " ('5703', 'Llay-Llay', '57', '5'), "+
                    " ('5704', 'Panquehue', '57', '5'), "+
                    " ('5705', 'Putaendo', '57', '5'), "+
                    " ('5706', 'Santa María', '57', '5'), "+
                    " ('5801', 'Quilpué', '58', '5'), "+
                    " ('5802', 'Limache', '58', '5'), "+
                    " ('5803', 'Olmué', '58', '5'), "+
                    " ('5804', 'Villa Alemana', '58', '5'), "+
                    " ('6101', 'Rancagua', '61', '6'), "+
                    " ('6102', 'Codegua', '61', '6'), "+
                    " ('6103', 'Coinco', '61', '6'), "+
                    " ('6104', 'Coltauco', '61', '6'), "+
                    " ('6105', 'Doñihue', '61', '6'), "+
                    " ('6106', 'Graneros', '61', '6'), "+
                    " ('6107', 'Las Cabras', '61', '6'), "+
                    " ('6108', 'Machalí', '61', '6'), "+
                    " ('6109', 'Malloa', '61', '6'), "+
                    " ('6110', 'Mostazal', '61', '6'), "+
                    " ('6111', 'Olivar', '61', '6'), "+
                    " ('6205', 'Navidad', '62', '6'), "+
                    " ('6206', 'Paredones', '62', '6'), "+
                    " ('6301', 'San Fernando', '63', '6'), "+
                    " ('6302', 'Chépica', '63', '6'), "+
                    " ('6303', 'Chimbarongo', '63', '6'), "+
                    " ('6304', 'Lolol', '63', '6'), "+
                    " ('6305', 'Nancagua', '63', '6'), "+
                    " ('6306', 'Palmilla', '63', '6'), "+
                    " ('6307', 'Peralillo', '63', '6'), "+
                    " ('6308', 'Placilla', '63', '6'), "+
                    " ('6112', 'Peumo', '61', '6'), "+
                    " ('6113', 'Pichidegua', '61', '6'), "+
                    " ('6114', 'Quinta de Tilcoco', '61', '6'), "+
                    " ('6115', 'Rengo', '61', '6'), "+
                    " ('6116', 'Requínoa', '61', '6'), "+
                    " ('6117', 'San Vicente', '61', '6'), "+
                    " ('6201', 'Pichilemu', '62', '6'), "+
                    " ('6202', 'La Estrella', '62', '6'), "+
                    " ('6203', 'Litueche', '62', '6'), "+
                    " ('6204', 'Marchigue', '62', '6'), "+
                    " ('6309', 'Pumanque', '63', '6'), "+
                    " ('6310', 'Santa Cruz', '63', '6'), "+
                    " ('7101', 'Talca', '71', '7'), "+
                    " ('7102', 'Constitución', '71', '7'), "+
                    " ('7103', 'Curepto', '71', '7'), "+
                    " ('7104', 'Empedrado', '71', '7'), "+
                    " ('7105', 'Maule', '71', '7'), "+
                    " ('7106', 'Pelarco', '71', '7'), "+
                    " ('7107', 'Pencahue', '71', '7'), "+
                    " ('7108', 'Río Claro', '71', '7'), "+
                    " ('7109', 'San Clemente', '71', '7'), "+
                    " ('7110', 'San Rafael', '71', '7'), "+
                    " ('7201', 'Cauquenes', '72', '7'), "+
                    " ('7202', 'Chanco', '72', '7'), "+
                    " ('7203', 'Pelluhue', '72', '7'), "+
                    " ('7301', 'Curicó', '73', '7'), "+
                    " ('7302', 'Hualañé', '73', '7'), "+
                    " ('7303', 'Licantén', '73', '7'), "+
                    " ('7304', 'Molina', '73', '7'), "+
                    " ('7305', 'Rauco', '73', '7'), "+
                    " ('7306', 'Romeral', '73', '7'), "+
                    " ('7307', 'Sagrada Familia', '73', '7'), "+
                    " ('7308', 'Teno', '73', '7'), "+
                    " ('7309', 'Vichuquén', '73', '7'), "+
                    " ('7401', 'Linares', '74', '7'), "+
                    " ('7402', 'Colbún', '74', '7'), "+
                    " ('7403', 'Longaví', '74', '7'), "+
                    " ('7404', 'Parral', '74', '7'), "+
                    " ('7405', 'Retiro', '74', '7'), "+
                    " ('7406', 'San Javier', '74', '7'), "+
                    " ('7407', 'Villa Alegre', '74', '7'), "+
                    " ('7408', 'Yerbas Buenas', '74', '7'), "+
                    " ('8101', 'Concepción', '81', '8'), "+
                    " ('8102', 'Coronel', '81', '8'), "+
                    " ('8103', 'Chiguayante', '81', '8'), "+
                    " ('8104', 'Florida', '81', '8'), "+
                    " ('8105', 'Hualqui', '81', '8'), "+
                    " ('8106', 'Lota', '81', '8'), "+
                    " ('8107', 'Penco', '81', '8'), "+
                    " ('8108', 'San Pedro de la Paz', '81', '8'), "+
                    " ('8109', 'Santa Juana', '81', '8'), "+
                    " ('8110', 'Talcahuano', '81', '8'), "+
                    " ('8111', 'Tomé', '81', '8'), "+
                    " ('8112', 'Hualpén', '81', '8'), "+
                    " ('8201', 'Lebu', '82', '8'), "+
                    " ('8202', 'Arauco', '82', '8'), "+
                    " ('8203', 'Cañete', '82', '8'), "+
                    " ('8204', 'Contulmo', '82', '8'), "+
                    " ('8205', 'Curanilahue', '82', '8'), "+
                    " ('8206', 'Los Alamos', '82', '8'), "+
                    " ('8207', 'Tirúa', '82', '8'), "+
                    " ('8301', 'Los Angeles', '83', '8'), "+
                    " ('8302', 'Antuco', '83', '8'), "+
                    " ('8303', 'Cabrero', '83', '8'), "+
                    " ('8304', 'Laja', '83', '8'), "+
                    " ('8305', 'Mulchén', '83', '8'), "+
                    " ('8306', 'Nacimiento', '83', '8'), "+
                    " ('8307', 'Negrete', '83', '8'), "+
                    " ('8308', 'Quilaco', '83', '8'), "+
                    " ('8309', 'Quilleco', '83', '8'), "+
                    " ('8310', 'San Rosendo', '83', '8'), "+
                    " ('8311', 'Santa Bárbara', '83', '8'), "+
                    " ('8312', 'Tucapel', '83', '8'), "+
                    " ('8313', 'Yumbel', '83', '8'), "+
                    " ('8314', 'Alto Biobío', '83', '8'), "+
                    " ('8401', 'Chillán', '84', '8'), "+
                    " ('8402', 'Bulnes', '84', '8'), "+
                    " ('8403', 'Cobquecura', '84', '8'), "+
                    " ('8404', 'Coelemu', '84', '8'), "+
                    " ('8405', 'Coihueco', '84', '8'), "+
                    " ('8406', 'Chillán Viejo', '84', '8'), "+
                    " ('8407', 'El Carmen', '84', '8'), "+
                    " ('8408', 'Ninhue', '84', '8'), "+
                    " ('8409', 'Ñiquén', '84', '8'), "+
                    " ('8410', 'Pemuco', '84', '8'), "+
                    " ('8411', 'Pinto', '84', '8'), "+
                    " ('8412', 'Portezuelo', '84', '8'), "+
                    " ('8413', 'Quillón', '84', '8'), "+
                    " ('8414', 'Quirihue', '84', '8'), "+
                    " ('8415', 'Ránquil', '84', '8'), "+
                    " ('8416', 'San Carlos', '84', '8'), "+
                    " ('8417', 'San Fabián', '84', '8'), "+
                    " ('8418', 'San Ignacio', '84', '8'), "+
                    " ('8419', 'San Nicolás', '84', '8'), "+
                    " ('8420', 'Treguaco', '84', '8'), "+
                    " ('8421', 'Yungay', '84', '8'), "+
                    " ('9101', 'Temuco', '91', '9'), "+
                    " ('9102', 'Carahue', '91', '9'), "+
                    " ('9103', 'Cunco', '91', '9'), "+
                    " ('9104', 'Curarrehue', '91', '9'), "+
                    " ('9105', 'Freire', '91', '9'), "+
                    " ('9106', 'Galvarino', '91', '9'), "+
                    " ('9107', 'Gorbea', '91', '9'), "+
                    " ('9108', 'Lautaro', '91', '9'), "+
                    " ('9109', 'Loncoche', '91', '9'), "+
                    " ('9110', 'Melipeuco', '91', '9'), "+
                    " ('9111', 'Nueva Imperial', '91', '9'), "+
                    " ('9112', 'Padre Las Casas', '91', '9'), "+
                    " ('9113', 'Perquenco', '91', '9'), "+
                    " ('9114', 'Pitrufquén', '91', '9'), "+
                    " ('9115', 'Pucón', '91', '9'), "+
                    " ('9116', 'Saavedra', '91', '9'), "+
                    " ('9117', 'Teodoro Schmidt', '91', '9'), "+
                    " ('9118', 'Toltén', '91', '9'), "+
                    " ('9119', 'Vilcún', '91', '9'), "+
                    " ('9120', 'Villarrica', '91', '9'), "+
                    " ('9121', 'Cholchol', '91', '9'), "+
                    " ('9201', 'Angol', '92', '9'), "+
                    " ('9202', 'Collipulli', '92', '9'), "+
                    " ('9203', 'Curacautín', '92', '9'), "+
                    " ('9204', 'Ercilla', '92', '9'), "+
                    " ('9205', 'Lonquimay', '92', '9'), "+
                    " ('9206', 'Los Sauces', '92', '9'), "+
                    " ('9207', 'Lumaco', '92', '9'), "+
                    " ('9208', 'Purén', '92', '9'), "+
                    " ('9209', 'Renaico', '92', '9'), "+
                    " ('9210', 'Traiguén', '92', '9'), "+
                    " ('9211', 'Victoria', '92', '9'), "+
                    " ('10101', 'Puerto Montt', '101', '10'), "+
                    " ('10102', 'Calbuco', '101', '10'), "+
                    " ('10103', 'Cochamó', '101', '10'), "+
                    " ('10104', 'Fresia', '101', '10'), "+
                    " ('10105', 'Frutillar', '101', '10'), "+
                    " ('10106', 'Los Muermos', '101', '10'), "+
                    " ('10107', 'Llanquihue', '101', '10'), "+
                    " ('10108', 'Maullín', '101', '10'), "+
                    " ('10109', 'Puerto Varas', '101', '10'), "+
                    " ('10201', 'Castro', '102', '10'), "+
                    " ('10202', 'Ancud', '102', '10'), "+
                    " ('10203', 'Chonchi', '102', '10'), "+
                    " ('10204', 'Curaco de Vélez', '102', '10'), "+
                    " ('10205', 'Dalcahue', '102', '10'), "+
                    " ('10206', 'Puqueldón', '102', '10'), "+
                    " ('10207', 'Queilén', '102', '10'), "+
                    " ('10208', 'Quellón', '102', '10'), "+
                    " ('10209', 'Quemchi', '102', '10'), "+
                    " ('10210', 'Quinchao', '102', '10'), "+
                    " ('10301', 'Osorno', '103', '10'), "+
                    " ('10302', 'Puerto Octay', '103', '10'), "+
                    " ('10303', 'Purranque', '103', '10'), "+
                    " ('10304', 'Puyehue', '103', '10'), "+
                    " ('10305', 'Río Negro', '103', '10'), "+
                    " ('10306', 'San Juan de la Costa', '103', '10'), "+
                    " ('10307', 'San Pablo', '103', '10'), "+
                    " ('10401', 'Chaitén', '104', '10'), "+
                    " ('10402', 'Futaleufú', '104', '10'), "+
                    " ('10403', 'Hualaihué', '104', '10'), "+
                    " ('10404', 'Palena', '104', '10'), "+
                    " ('11101', 'Coihaique', '111', '11'), "+
                    " ('11102', 'Lago Verde', '111', '11'), "+
                    " ('11201', 'Aisén', '112', '11'), "+
                    " ('11202', 'Cisnes', '112', '11'), "+
                    " ('11203', 'Guaitecas', '112', '11'), "+
                    " ('11301', 'Cochrane', '113', '11'), "+
                    " ('11302', 'OHiggins', '113', '11'), "+
                    " ('11303', 'Tortel', '113', '11'), "+
                    " ('11401', 'Chile Chico', '114', '11'), "+
                    " ('11402', 'Río Ibáñez', '114', '11'), "+
                    " ('12101', 'Punta Arenas', '121', '12'), "+
                    " ('12102', 'Laguna Blanca', '121', '12'), "+
                    " ('12103', 'Río Verde', '121', '12'), "+
                    " ('12104', 'San Gregorio', '121', '12'), "+
                    " ('12201', 'Cabo de Hornos (Ex-Navarino)', '122', '12'), "+
                    " ('12202', 'Antártica', '122', '12'), "+
                    " ('12301', 'Porvenir', '123', '12'), "+
                    " ('12302', 'Primavera', '123', '12'), "+
                    " ('12303', 'Timaukel', '123', '12'), "+
                    " ('12401', 'Natales', '124', '12'), "+
                    " ('12402', 'Torres del Paine', '124', '12'), "+
                    " ('13101', 'Santiago', '131', '13'), "+
                    " ('13102', 'Cerrillos', '131', '13'), "+
                    " ('13103', 'Cerro Navia', '131', '13'), "+
                    " ('13104', 'Conchalí', '131', '13'), "+
                    " ('13105', 'El Bosque', '131', '13'), "+
                    " ('13106', 'Estación Central', '131', '13'), "+
                    " ('13107', 'Huechuraba', '131', '13'), "+
                    " ('13108', 'Independencia', '131', '13'), "+
                    " ('13109', 'La Cisterna', '131', '13'), "+
                    " ('13110', 'La Florida', '131', '13'), "+
                    " ('13111', 'La Granja', '131', '13'), "+
                    " ('13112', 'La Pintana', '131', '13'), "+
                    " ('13113', 'La Reina', '131', '13'), "+
                    " ('13114', 'Las Condes', '131', '13'), "+
                    " ('13115', 'Lo Barnechea', '131', '13'), "+
                    " ('13116', 'Lo Espejo', '131', '13'), "+
                    " ('13117', 'Lo Prado', '131', '13'), "+
                    " ('13118', 'Macul', '131', '13'), "+
                    " ('13119', 'Maipú', '131', '13'), "+
                    " ('13120', 'Ñuñoa', '131', '13'), "+
                    " ('13121', 'Pedro Aguirre Cerda', '131', '13'), "+
                    " ('13122', 'Peñalolén', '131', '13'), "+
                    " ('13123', 'Providencia', '131', '13'), "+
                    " ('13124', 'Pudahuel', '131', '13'), "+
                    " ('13125', 'Quilicura', '131', '13'), "+
                    " ('13126', 'Quinta Normal', '131', '13'), "+
                    " ('13127', 'Recoleta', '131', '13'), "+
                    " ('13128', 'Renca', '131', '13'), "+
                    " ('13129', 'San Joaquín', '131', '13'), "+
                    " ('13130', 'San Miguel', '131', '13'), "+
                    " ('13131', 'San Ramón', '131', '13'), "+
                    " ('13132', 'Vitacura', '131', '13'), "+
                    " ('13201', 'Puente Alto', '132', '13'), "+
                    " ('13202', 'Pirque', '132', '13'), "+
                    " ('13203', 'San José de Maipo', '132', '13'), "+
                    " ('13301', 'Colina', '133', '13'), "+
                    " ('13302', 'Lampa', '133', '13'), "+
                    " ('13303', 'Tiltil', '133', '13'), "+
                    " ('13401', 'San Bernardo', '134', '13'), "+
                    " ('13402', 'Buin', '134', '13'), "+
                    " ('13403', 'Calera de Tango', '134', '13'), "+
                    " ('13404', 'Paine', '134', '13'), "+
                    " ('13501', 'Melipilla', '135', '13'), "+
                    " ('13502', 'Alhué', '135', '13'), "+
                    " ('13503', 'Curacaví', '135', '13'), "+
                    " ('13504', 'María Pinto', '135', '13'), "+
                    " ('13505', 'San Pedro', '135', '13'), "+
                    " ('13601', 'Talagante', '136', '13'), "+
                    " ('13602', 'El Monte', '136', '13'), "+
                    " ('13603', 'Isla de Maipo', '136', '13'), "+
                    " ('13604', 'Padre Hurtado', '136', '13'), "+
                    " ('13605', 'Peñaflor', '136', '13'), "+
                    " ('14101', 'Valdivia', '141', '14'), "+
                    " ('14102', 'Corral', '141', '14'), "+
                    " ('14103', 'Lanco', '141', '14'), "+
                    " ('14104', 'Los Lagos', '141', '14'), "+
                    " ('14105', 'Máfil', '141', '14'), "+
                    " ('14106', 'Mariquina', '141', '14'), "+
                    " ('14107', 'Paillaco', '141', '14'), "+
                    " ('14108', 'Panguipulli', '141', '14'), "+
                    " ('14201', 'La Unión', '142', '14'), "+
                    " ('14202', 'Futrono', '142', '14'), "+
                    " ('14203', 'Lago Ranco', '142', '14'), "+
                    " ('14204', 'Río Bueno', '142', '14'), "+
                    " ('15101', 'Arica', '151', '15'), "+
                    " ('15102', 'Camarones', '151', '15'), "+
                    " ('15201', 'Putre', '152', '15'), "+
                    " ('15202', 'General Lagos', '152', '15'); ";

}
