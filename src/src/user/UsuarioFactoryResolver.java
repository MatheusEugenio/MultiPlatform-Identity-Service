package user;

import user.constante.TipoDeUsuario;

import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class UsuarioFactoryResolver {

    /// DECIDE O QUE TEM QUE SER PREENCHIDO NO USUÁRIO DE ACORDO COM O SEU TIPO
    private final Map<TipoDeUsuario, FactoryUsuario> factories;

    public UsuarioFactoryResolver(Set<FactoryUsuario> factorySet) {
        this.factories = factorySet.stream()
                .collect(Collectors.toMap(
                        FactoryUsuario::getTipe,
                        userfac -> userfac));
    }

    public Usuario criar(TipoDeUsuario tipoUsuario, Usuario.Builder<?> builder) {

        FactoryUsuario factory = factories.get(tipoUsuario);

        if (factory == null){
            throw new IllegalStateException("Erro: tipo de usuário inválido!");
        }

        return factory.criar(builder);
    }

}
